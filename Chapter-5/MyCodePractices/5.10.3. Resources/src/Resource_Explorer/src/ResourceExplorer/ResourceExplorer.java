package ResourceExplorer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public  class ResourceExplorer extends JFrame {

    private JTable table;

    public ResourceExplorer(){
        setTitle("Resource File Explorer");         // টাইটেল বার-এ নাম দেখায়
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // উইন্ডো বন্ধ করলে প্রোগ্রামও বন্ধ হবে
        setSize(700, 400);                          // উইন্ডোর দৈর্ঘ্য এবং প্রস্থ নির্ধারণ
        setLocationRelativeTo(null);               // স্ক্রিনের মাঝখানে উইন্ডো দেখায়

        // টেবিল মডেল তৈরি করি যাতে আমরা তথ্য দেখাতে পারি
        DefaultTableModel model = new DefaultTableModel(new Object[]{"File Name", "Type", "Size (bytes)", "First Line / Info"},0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // প্যাকেজ যেখানে resource ফাইল রাখা আছে
        String resourcePath = "/resources/data";
        List<String> resourceNames = getResourceNamesFromJar(resourcePath);

        // প্রতিটি রিসোর্স ফাইল ঘুরে প্রয়োজনীয় তথ্য সংগ্রহ করি
        for (String name : resourceNames){
            try (InputStream is = getClass().getClassLoader().getResourceAsStream(name)){
                if ( is != null) {
                    String type = getFileType(name);
                    int size = is.available(); // ফাইল সাইজ
                    String firstLine =  getFirstLineOrInfo(is, type); // প্রথম লাইন বা তথ্য
                    model.addRow(new Object[]{name, type,size,firstLine});

                }

            } catch (IOException e){
                model.addRow(new Object[]{name, "Unknown", "-", "Error reading"});
            }
        }

    }

    // ফাইল টাইপ বের করি নাম দেখে

    private String getFileType(String name){
        if (name.endsWith(".text")) return  "Text File";
        if (name.endsWith(".png") || name.endsWith(".jpg")) return "Image File";
        return "Unknown";
    }
    // ফাইল থেকে প্রথম লাইন বের করি যদি Text হয়, নাহলে info দেখাই
    private String getFirstLineOrInfo(InputStream is,String type ) throws IOException {
        if (type.equalsIgnoreCase("TEXT FILES")){
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return  reader.readLine(); // টেক্সট ফাইলের প্রথম লাইন
        } else if (type.equalsIgnoreCase("Image File")) {
            return  "Image Content";
        }
        return "Unknown file";
    }
    // JAR ফাইল থেকে একটি নির্দিষ্ট প্যাকেজের সব ফাইলের নাম পাই

    private List<String>getResourceNamesFromJar(String folderPath) {
        List<String> names = new ArrayList<>();
        try {

            // বর্তমান class file কোথা থেকে এসেছে তা বের করি
            String jarPath = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
            jarPath = URLDecoder.decode(jarPath, "UTF-8");

            // jar ফাইল থেকে পড়ার জন্য JarFile তৈরি করি
            try (JarFile jar = new JarFile(jarPath)) {
                Enumeration<JarEntry> entries = jar.entries();

                // প্রতিটি entry ঘুরে দেখি যে নির্দিষ্ট পাথের মধ্যে পড়ে কি না
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    String name = entry.getName();

                    if (name.startsWith(folderPath) && !name.endsWith("/")) {
                        names.add(name); // ফাইল নাম যোগ করি

                    }
                }
            }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return names;


        }
    }



package ClassAnalyzerTool;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassAnalyzerTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔍 ক্লাসের পূর্ণ নাম লিখুন (যেমন: java.util.ArrayList): ");
        String className = scanner.nextLine();

        try{
            Class<?> cls = Class.forName(className);
            System.out.println("\n📘 ক্লাস বিশ্লেষণ: " +cls.getName());

            Package pkg = cls.getPackage();
            System.out.println("📦 প্যাকেজ: " + (pkg != null ? pkg.getName() : "ডিফল্ট প্যাকেজ"));

            // সুপারক্লাস
            Class<?>  superClass = cls.getSuperclass();
            System.out.println("🧬 সুপারক্লাস: "  +(superClass != null ? superClass.getName() :"নেই" ));
            //"যদি superClass null না হয়, তাহলে superClass.getName() ফেরত দাও। নয়তো 'নেই' লেখো।"

            // ইন্টারফেস
            Class<?>[] interfaces = cls.getInterfaces();
            System.out.println("🔗 ইন্টারফেস:");
            for (Class<?> iface : interfaces) {
                System.out.println(" - " + iface.getName());
            }

            // ফিল্ডসমূহ
            Field[] fields = cls.getDeclaredFields();
            System.out.println(" ফিল্ডসমূহ");
            for (Field field : fields){
                System.out.println("  - " + Modifier.toString(field.getModifiers()) + " " +
                        field.getType().getSimpleName() +""+ field.getName());
            }

            // কনস্ট্রাক্টরসমূহ
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            System.out.println("  কনস্ট্রাক্টরসমূহ");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" _ " + Modifier.toString(constructor.getModifiers()) +" " +
                        constructor.getName() +"(");
                Class<?>[] paramTypes = constructor.getParameterTypes();
                for (int i = 0; i < paramTypes.length; i++) {
                    System.out.println(paramTypes[i].getName());
                    if (i < paramTypes.length- 1) System.out.println(", ");
                }
                System.out.println(")");
            }

            //⚙️ মেথডসমূহ:
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("⚙️ মেথডসমূহ:");
            for (Method method : methods){
                System.out.println(" -" + Modifier.toString(method.getModifiers()) + " " +
                        method.getReturnType().getSimpleName() + " " +
                        method.getName() + "(");
                Class<?>[] paramTypes = method.getParameterTypes();
                for (int i = 0; i< paramTypes.length; i ++){
                    System.out.println(paramTypes[i].getSimpleName());
                    if (i < paramTypes.length - 1)
                        System.out.println(",");
                }
                System.out.println(")");
            }


        } catch (ClassNotFoundException e ){
            System.out.println("❌ ক্লাস খুঁজে পাওয়া যায়নি: " + className);
        } catch (Exception e){
            System.out.println("❌ একটি ত্রুটি ঘটেছে:");
            e.printStackTrace();
        } finally {
            {
                scanner.close();
            }
        }
    }
}

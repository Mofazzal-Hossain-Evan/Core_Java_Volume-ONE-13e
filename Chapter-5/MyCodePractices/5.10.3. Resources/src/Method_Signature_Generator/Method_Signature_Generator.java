import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Method_Signature_Generator {

    public static void main(String[] args) {


        // ইনপুট চেক করি: কমপক্ষে ১টি ক্লাসের নাম দিতে হবে
        if (args.length == 0){
            System.out.println("ব্যবহারবিধি: java MethodInspector.MethodSignatureGenerator <class-name> [filter]");
            System.out.println("উদাহরণ: java MethodInspector.MethodSignatureGenerator java.util.ArrayList public");
            return;
        }


        String className = args[0]; // প্রথম আর্গুমেন্টে ক্লাসের নাম
        String filter = args.length >= 2 ? args[1].toLowerCase() : ""; // দ্বিতীয় আর্গুমেন্টে ফিল্টার (যদি দেওয়া হয়)

        try{

        Class<?> cls = Class.forName(className);
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("===== " + className + " এর মেথড সিগনেচারসমূহ =====\n");


        for (Method method : methods){
            int mod = method.getModifiers();

            // যদি ফিল্টার থাকে, তখন চেক করি
            if (filter.equalsIgnoreCase("Public") && !Modifier.isPublic(mod)) continue;
            if (filter.equals("static") && !Modifier.isStatic(mod)) continue;

            // মেথড সিগনেচার বানাই
            StringBuilder sb = new StringBuilder();

            sb.append(Modifier.toString(mod)).append("");
            sb.append(method.getReturnType().getSimpleName()).append("");// return টাইপ
            sb.append(method.getName());

            sb.append("(");
            // প্যারামিটার শুরু
            Class<?>[] paramTypes = method.getParameterTypes(); // প্যারামিটার টাইপগুলো নেই
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(paramTypes[i].getSimpleName()); // যেমন int, String
            }
            sb.append(")");

            // যদি exception থ্রো করে, সেটা দেখাই
            Class<?>[] exTypes = method.getExceptionTypes();
            if (exTypes.length > 0) {
                sb.append(" throws ");
                for (int i = 0; i < exTypes.length; i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(exTypes[i].getSimpleName()); // যেমন IOException
                }
            }

            // প্রিন্ট করি প্রতিটি মেথড সিগনেচার
            System.out.println(sb);
        }

        } catch (ClassNotFoundException e) {
            System.out.println("⚠️ ক্লাস খুঁজে পাওয়া যায়নি: " + className);
        } catch (Exception e) {
            System.out.println("⚠️ ত্রুটি ঘটেছে: " + e.getMessage());
        }

        }
    }


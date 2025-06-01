package Dynamic_Class_Loader_and_Inspector;

public class ExceptionAnalyzer {

    public boolean isCheckedException(Class<? extends Throwable> exceptionClass) {
        return Exception.class.isAssignableFrom(exceptionClass) && !RuntimeException.class.isAssignableFrom(exceptionClass);
    }

    public void displayExceptionHierarchy(Class<?> exceptionClass) {
        if (!Throwable.class.isAssignableFrom(exceptionClass)) {
            System.out.println(exceptionClass.getName() + " is not an exception type!");
            return;
        }

        System.out.println("\n===== Exception Hierarchy =====");

        Class<?> current = exceptionClass;
        int level = 0;

        while (current != null && Throwable.class.isAssignableFrom(current)) {
            String checkedStatus = "";
            if (Exception.class.isAssignableFrom(current)) {
                if (RuntimeException.class.isAssignableFrom(current)) {
                    checkedStatus = " (Unchecked)";
                } else {
                    checkedStatus = " (Checked)";
                }
            }

            System.out.println("Level " + level + ": " + current.getName() + checkedStatus);
            if (current == Throwable.class) {
                break;
            }
            current = current.getSuperclass();
            level++;
        }
    }
}

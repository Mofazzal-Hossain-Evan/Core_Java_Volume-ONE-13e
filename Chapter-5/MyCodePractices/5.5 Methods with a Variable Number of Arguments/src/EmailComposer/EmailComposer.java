package EmailComposer;

public class EmailComposer {
    public static String composeEmail(String subject, String... bodyLines){
        StringBuilder email = new StringBuilder();
        email.append("Subject: ").append(subject).append("\n\n");
        for (String line : bodyLines){
            email.append(line).append("\n");
        }
        return email.toString();
    }
}

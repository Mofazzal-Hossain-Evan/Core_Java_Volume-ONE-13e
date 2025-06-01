package EmailComposer;

public class Main {
    public static void main(String[] args) {
        String email = EmailComposer.composeEmail(
                "Meeting Reminder",
                "Dear Team,",
                "Just a reminder for tomorrow's meeting at 10am.",
                "Regards,",
                "Team Lead"
        );

        System.out.println(email);
    }
}

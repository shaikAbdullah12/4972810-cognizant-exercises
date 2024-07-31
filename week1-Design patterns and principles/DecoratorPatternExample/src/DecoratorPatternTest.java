public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic email notification
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello, this is an email notification!");

        // Email and SMS notification
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsAndEmailNotifier.send("Hello, this is an email and SMS notification!");

        // Email, SMS, and Slack notification
        Notifier allNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        allNotifier.send("Hello, this is an email, SMS, and Slack notification!");
    }
}


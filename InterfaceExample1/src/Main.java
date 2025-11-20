public class Main {
    public static void main(String[] args) {


        INotification bildirim = new SmsNotification();
        INotification bildirim2 = new EmailNotification();


        bildirim.sendNotification("Sisteminizde güvenlik açığı tespit edildi!");
        bildirim2.sendNotification("Sisteminde açık var bro.");
    }
}
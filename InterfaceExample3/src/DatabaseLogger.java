public class DatabaseLogger implements ILogger {
    @Override
    public void log(String message) {

        System.out.println("Veritabanına INSERT edildi: " + message);
    }
}

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
    ILogger logger = new DatabaseLogger();
    logger.log("Muhammet");

    ILogger logger2 = new FileLogger();
        logger.log("OgrBelgesi.pdf");
    }
}
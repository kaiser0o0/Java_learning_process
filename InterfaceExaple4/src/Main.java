// Main.java
public class Main {
    public static void main(String[] args) {

        // SENARYO A: Gerçek veritabanı ile çalışmak istiyoruz
        System.out.println("--- SENARYO A (MySQL) ---");
        IUserRepository sqlRepo = new MySQLUserRepository();
        UserManager managerA = new UserManager(sqlRepo);
        managerA.registerUser(1, "Ali Veli");

        System.out.println("\n----------------\n");

        // SENARYO B: Test yapıyoruz, veritabanı yok (veya bozuk)
        System.out.println("--- SENARYO B (Test/RAM) ---");
        IUserRepository memoryRepo = new InMemoryUserRepository();
        UserManager managerB = new UserManager(memoryRepo);
        managerB.registerUser(2, "Test Kullanıcısı");
    }
}
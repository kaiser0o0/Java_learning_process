// UserManager.java
public class UserManager {
    private IUserRepository repository; // Dikkat: Interface türünde değişken!

    // Dependency Injection (Bağımlılık Enjeksiyonu)
    // "Bana bir depo ver ama ne olduğu umurumda değil" diyor.
    public UserManager(IUserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(int id, String name) {
        User newUser = new User(id, name);

        // İş mantığı: İsim boş olamaz vs. kontrol edilebilir.
        if (name.isEmpty()) {
            System.out.println("Hata: İsim boş olamaz!");
            return;
        }

        // Kayıt işlemi (Nereye kaydettiğini bilmiyor, sadece save diyor)
        repository.save(newUser);
    }
}
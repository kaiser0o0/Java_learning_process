public class Main {
    public static void main(String[] args) {

        // --- 1. KULLANICI İÇİN DEPO OLUŞTUR ---

        IRepository<User> userRepo = new GenericDatabase<>();

        User ahmet = new User(1, "Ahmet");
        userRepo.save(ahmet);


        // --- 2. ÜRÜN İÇİN DEPO OLUŞTUR ---

        IRepository<Product> productRepo = new GenericDatabase<>();

        Product laptop = new Product("Laptop", 25000);
        productRepo.save(laptop);
        productRepo.delete(laptop);
    }
}
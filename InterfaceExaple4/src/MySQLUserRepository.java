public class MySQLUserRepository implements IUserRepository{


    @Override
    public void save(User user) {
        System.out.println("MySQL Veritabanına Bağlanıldı...");
        System.out.println("Kayıt Başarılı: " + user.getName() + " (MySQL)");
    }

    @Override
    public User findById(int id) {
        System.out.println("MySQL'den ID=" + id + " olan kullanıcı çekiliyor...");
        return new User(id, "MySQL'den Gelen Ahmet"); // Sahte veri döndük
    }
}

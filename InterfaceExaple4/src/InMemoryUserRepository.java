public class InMemoryUserRepository implements IUserRepository {
    @Override
    public void save(User user) {
        System.out.println("RAM (Hafıza) üzerine geçici yazıldı: " + user.getName());
    }

    @Override
    public User findById(int id) {
        System.out.println("RAM'den ID=" + id + " okunuyor...");
        return new User(id, "Test Kullanıcısı Mehmet");
    }
}

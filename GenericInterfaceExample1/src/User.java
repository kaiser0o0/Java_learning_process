public class User implements IBaseEntity {
    private int id;
    private String name;

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kullanıcı: " + id + "-" + name;
    }
}
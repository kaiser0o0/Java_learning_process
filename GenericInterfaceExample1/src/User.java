public class User {
    private int id;
    private String name;

    //Constructer
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Kullanıcı: " + id + "-" + name;
    }
}
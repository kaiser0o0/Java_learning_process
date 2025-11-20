public class User {
    private int id;
    private String name;


    //Constructer
    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


}

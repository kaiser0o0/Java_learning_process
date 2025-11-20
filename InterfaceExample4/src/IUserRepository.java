public interface IUserRepository {
    void save(User user);
    User findById(int id);
}

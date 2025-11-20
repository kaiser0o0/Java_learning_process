public interface IRepository<T> {
    void save(T data);


    void delete(T data);

}

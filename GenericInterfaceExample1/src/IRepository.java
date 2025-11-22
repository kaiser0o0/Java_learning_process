public interface IRepository<T extends IBaseEntity> {
    void save(T data);

    void delete(T data);
}
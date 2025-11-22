public class GenericDatabase<T extends IBaseEntity> implements IRepository<T> {

    @Override
    public void save(T data) {
        System.out.println("Veritabanına Kaydedildi: " + data.toString());
    }

    @Override
    public void delete(T data) {
        System.out.println("Veritabanından Silindi: " + data.toString());
    }
}
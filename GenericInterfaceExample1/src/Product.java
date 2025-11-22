public class Product implements IBaseEntity {
    private String urunAdi;
    private int fiyat;

    public Product(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Ürün: " + urunAdi + " (" + fiyat + " TL)";
    }
}
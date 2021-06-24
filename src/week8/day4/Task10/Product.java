package week8.day4.Task10;

public class Product {
    static long countForId = 0;
    private long ID;
    private String name;
    private String category;
    private Double price;

    public static void setCountForId(long countForId) {
        Product.countForId = countForId;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String name, String category, Double price) {
        this.ID = countForId++;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    Product setAndGetPrice(double price) {
        this.setPrice(price);
        return this;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                        ", name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        "}\n";
    }
}

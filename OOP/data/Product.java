package data;
public abstract class Product {
    protected String number;
    protected String brand;
    protected String name;

    public Product(String number, String brand, String name) {
        this.number = number;
        this.brand = brand;
        this.name = name;
    }

    // 抽象類別，CPU 和 Memory 各自實作 getPrice()，用多型實作不同邏輯
    public abstract int getPrice();

    public void render() {
        System.out.println(
            this.number + "," +
            this.brand + "," +
            this.name
        );
    }
}

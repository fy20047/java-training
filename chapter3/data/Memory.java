package data;
public class Memory extends Product {
    private int size; // 空間量：多少 GB

    // 建構式，初始化物件屬性
    // 建立子類別的物件之前，必須先呼叫父類別的建構式
    public Memory(String number, String brand, String name, int size) {
        // 預設會執行super()，因此若未呼叫父類別的建構式，就會噴錯
        super(number, brand, name); // 讓子類別的建構式，可以初始化父類別的物件屬性
        this.size = size;
    }

    public int getPrice() {
        return this.size * 1000;
    }
}

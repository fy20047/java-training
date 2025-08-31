package data;
// Inheritance: 讓子類別自動繼承父類別的欄位與方法，避免重複程式碼
public class CPU extends Product implements Renderable {
    // Encapsulation: private 只能透過建構子或方法（render()、getPrice()）來使用，不能被外部直接修改
    private double clockRate;  // 時脈
    private int coreNumber;    // 核心數

    public CPU(
        String number,
        String brand,
        String name,
        double clockRate,
        int coreNumber
    ) {
        super(number, brand, name);
        this.clockRate = clockRate;
        this.coreNumber = coreNumber;
    }

    public int getPrice() {
        return this.coreNumber * 1000 +
               (int)(this.clockRate * 2000);
    }

    public void render() {
        String description = this.number + "," +
                             this.brand + "," +
                             this.name + "," +
                             this.clockRate + "," +
                             this.coreNumber;
        System.out.println(description);
    }
}

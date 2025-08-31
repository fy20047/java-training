import data.*;
// public → 到處都能用
// protected → 同 package + 子類別能用
// default → 只有同 package
// private → 只能自己用
class App {
    public static void main(String[] args) {
        // 類別名稱可以式自訂的資料型態，用來做變數的宣告 (如此處的CPU)
        CPU cpu = new CPU("P01", "A牌", "CPU-X", 2.4, 4);
        App.getDescription(cpu);

        Dog dog = new Dog("小黑");
        App.getDescription(dog);

        /*
        // 子類別的型態 > 父類別的型態: 向上轉型 (Upcasting)
        Class2 c2 = new Class2("測試", 5);
        Class1 c1 = c2;  // 無痛轉換 OK!
        c1.render();
        // 父類別的型態 > 子類別的型態: 向下轉型（Downcasting）
        Class2 c2_new = (Class2)c1; // 需明確的轉換回去
        // Class2 c2_new = c1; // 無明確轉換，錯誤
        System.out.println(c2_new.number);
        // 父類別的型態 > 子類別的型態，不可行的情況:
        Class1 c1 = new Class1("測試");
        c2 = (Class2)c1; // 錯誤，非子類別的物件
        Class2 c2_new = new Class1("哈哈"); // 也錯誤，非子類別的物件
        */

        // Memory memory = new Memory("M01", "G牌", "記憶體", 4);
        /*
        int cpuTotalPrice = App.getTotalPrice(cpu, 2);
        System.out.println(cpuTotalPrice);

        int memoryTotalPrice = App.getTotalPrice(memory, 4);
        System.out.println(memoryTotalPrice);
        */
    }

    private static void getDescription(Renderable renderable) {
        renderable.render();
    }

    private static int getTotalPrice(Product product, int qty) {
        return product.getPrice() * qty;
    }
}

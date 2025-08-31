import math.BasicMath; // 只要先載入，內部程式碼就可以不用寫封包名稱，直接寫類別名稱就好
import math.geometry.Rectangle;
// import math.geometry.*; // 一次載入多個 class
class App {
    public static void main(String[] args) {
        // 程式進入點
        System.out.println(BasicMath.PI);
        int result = BasicMath.add(3, 4);
        System.out.println(result);
        System.out.println(Rectangle.GOLDEN_RATIO);
    }
}



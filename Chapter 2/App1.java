import math.geometry.Point; // 只要先載入，內部程式碼就可以不用寫封包名稱，直接寫類別名稱就好
// import math.geometry.*; // 一次載入多個 class
class App1 {
    public static void main(String[] args) {
        // 程式進入點
        System.out.println(Point.ORIGIN_X);
        Point.renderOrigin(); // 呼叫類別的方法
        // System.out.println(Point.x); // 錯誤，不能使用類別的方式來取得"物件的屬性"
        
        // ------以上為類別，以下為物件------
         
        // 呼叫建構式，產生 Point 物件實體
        // new Point(); // 這是一個物件實體，通常要放進一個變數內，如下行
        Point obj = new Point(3, 4); // 類別可以做為自定義的資料型態
        System.out.println(obj.x); 
        System.out.println(obj.y); 
        obj.render(); // 呼叫物件的方法

        Point p2 = new Point(1, 1); // 產生第二個物件實體
        System.out.println(p2.x); 
        p2.render();
    }
}

// 類別是物件實體的藍圖(設計圖)



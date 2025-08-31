package math.geometry;
public class Point{ // 因為要在 App.java 使用，所以用 public
    // 類別的屬性和方法 (static)
    public static int ORIGIN_X = 0; // 類別屬性
    public static int ORIGIN_Y = 0; // 類別屬性
    public static void renderOrigin() { // 類別方法
        System.out.println(Point.ORIGIN_X + "," + Point.ORIGIN_Y);
    }

    // ------以上為類別，以下為物件------

    // 物件的屬性、方法、建構式 (non-static)
    public int x;
    public int y;
    // public Point(){}; // 空白基礎的建構式
    public Point(int xArg, int yArg){
        this.x = xArg;
        this.y = yArg;
    }

    // 設計 Getters
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void render() {
        System.out.println(this.x + "," + this.y);
    }

}
import data.Person; // 載入 data 封包的 Person 類別
class App2 {
    public static void main(String[] args) {
        Person p1 = new Person("小白", 20);
        p1.talk();
        Person p2 = new Person("小丁");
        p2.talk();
    }
}
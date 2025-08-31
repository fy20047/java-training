class Test1 {
    // 類別的屬性 Class Attribute/Static Attribute
    static int a = 10;
    static String s = "Hello Class";
}

class Test2 {
    static double a = 3.14;
    public static void main(String[] args) {
        System.out.println(Test1.a); // 10
        System.out.println(Test1.s); // Hello Class
        System.out.println(Test2.a); // 3.14
        Test1.a++;
        System.out.println(Test1.a); // 11
    }
}
class Test {
    public static void main(String[] args) {
        // 程式進入點
        // Test.talk(); // 呼叫類別的方法
        Test.talk("Heyyy");
        Test.talk("Heyyy2");
        int ans = BasicMath.add(3, 4);
        System.out.println(ans);
        ans = BasicMath.multiply(4, 2);
        System.out.println(ans);
    }
    // 定義更多自己的類別方法
    static void talk(String content) {
        // System.out.println("Hello");
        System.out.println(content);
    }
}

class BasicMath {
    static int add(int n1, int n2) {
        // int result = n1 + n2;
        // System.out.println(result);
        return n1 + n2;
    }   

    static int multiply(int n1, int n2) {
        // int result = n1 * n2;
        // System.out.println(result);
        return n1 * n2;
    }
}
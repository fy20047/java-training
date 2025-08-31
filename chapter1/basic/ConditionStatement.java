
import java.util.Scanner;
public class ConditionStatement {
    public static void main(String args[]) {
        // 使用標準輸入（從終端機輸入）
        // Scanner s = new Scanner(System.in); // 建立 Scanner 物件
        // System.out.println("請輸入一個整數：");
        // int x = s.nextInt();
        // System.out.println(x * 10);

        // if 判斷式
        // Scanner s = new Scanner(System.in);
        // System.out.println("請問你想領多少錢？");
        // int money = s.nextInt();

        // if (money > 100000) {
        //     System.out.println("太多了，不能領");
        // } else if (money >= 100){
        //     System.out.println("OK，錢在這裡：" + money + " 元");
        // } else {
        //     System.out.println("太少了，不能領");
        // }

        // switch 判斷式
        int n1 = 3;
        int n2 = 4;
        System.out.println("請輸入想要做的運算（支援 + - * /）：");
        Scanner s = new Scanner(System.in);
        String op = s.next();
        System.out.println("使用者輸入的運算符號");
        System.out.println(op);

        switch(op) {
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("不支援此運算符號");
                break;
        }
    }
}
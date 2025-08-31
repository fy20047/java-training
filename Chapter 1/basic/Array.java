import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // 陣列基本練習
        // int[] grades = new int[3];
        // int[] grades = new int[]{70, 80, 90};
        // System.out.println("陣列長度："+ grades.length);
        // // grades[0] = 70;
        // // grades[1] = 80;
        // // grades[2] = 90;
        // // System.out.println(grades[0]); 
        // // System.out.println(grades[1]); 
        // // System.out.println(grades[2]); 
        // for (int i = 0; i < grades.length; i++) {
        //     System.out.println(grades[i]);
        // }

        // 輸入學生的數量，以及每位學生的成績，計算平均數
        System.out.println("請輸入有幾位學生?");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt(); // 取得一個整數輸入
        int[] grades = new int[number];
        System.out.println("請逐一輸入學生的成績:");
        for (int i = 0; i < grades.length; ++i) {
            grades[i] = s.nextInt();
        }

        int total = 0;
        for (int i = 0; i < grades.length; ++i) {
            total += grades[i];
        }
        int avg = total/grades.length;
        System.out.println("平均成績是:" + avg);
    }
}
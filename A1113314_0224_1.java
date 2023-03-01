import java.util.Scanner;

public class A1113314_0224_1 {
    public static void main(String[] argv) {
        Scanner inPut = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int num = inPut.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " 是偶數。");
        } else {
            System.out.println(num + " 是奇數。");
        }
    }
}

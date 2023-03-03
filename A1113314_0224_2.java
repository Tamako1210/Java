import java.util.Scanner;

public class A1113314_0224_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度：");
        double celsius = input.nextDouble();

        // 將攝氏溫度轉換為華氏溫度
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.println("華氏溫度為：" + fahrenheit);
    }
}

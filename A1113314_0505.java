import java.util.*;

public class A1113314_0505{
    public static void main(String[] argv) {
        int[] winningNumbers = { 3, 8, 11, 17, 20, 35 };
        int[] Numbers = new int[6];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("請輸入第" + (i+1) + "個數字(1~49): ");
            int num = sc.nextInt();
            if (num < 1 || num > 49) {
                System.out.println("輸入的數字必須在1~49之間。");
                System.exit(0);
            }
            Numbers[i] = num;
        }
        
        Arrays.sort(Numbers);
        int matchNumber = 0;
        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(winningNumbers, Numbers[i]) >= 0) {
                matchNumber++;
            }
        }
        
        if (matchNumber == 6) {
            System.out.println("恭喜你中了頭獎！");
        } else if (matchNumber == 5) {
            System.out.println("恭喜你中了貳獎！");
        } else if (matchNumber == 4) {
            System.out.println("恭喜你中了參獎！");
        } else if (matchNumber == 3) {
            System.out.println("恭喜你中了肆獎！");
        } else {
            System.out.println("很遺憾，你沒有中獎。");
        }
    }
}
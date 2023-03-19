import java.util.Scanner;

public class A1113314_0317 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入n：");
        int n = scanner.nextInt();
        System.out.print("請輸入m：");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("二維陣列的值為：");
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
import java.io.*;

public class A1113314_0421_1 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        boolean isMail;
        do{
            isMail = true;
            System.out.println("請輸入電子郵件信箱：");
            str = br.readLine();
            if (str.matches("[a-z]+@[a-z]+.[a-z]+")) {
            System.out.println("輸入的電子郵件信箱格式正確。");
            isMail = true;
            }else {
            System.out.println("輸入的電子郵件信箱格式錯誤。");
            isMail = false;
            }
        }while (!isMail);
    }
}
import java.io.*;

public class A1113314_0421_2 {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        boolean isDate;
        do {
            isDate = true;
            System.out.print("請輸入日期(YYYY/MM/DD或MM/DD/YYYY)：");
            str = br.readLine();
            if (str.matches("[0-9]{4}/(0[0-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])")) {
                System.out.println(str.substring(0, 4) + "年" + str.substring(5, 7) + "月" + str.substring(8, 10) + "日");
                isDate = true;
            } else if (str.matches("(0[0-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/[0-9]{4}")) {
                System.out.println(str.substring(6, 10) + "年" + str.substring(0, 2) + "月" + str.substring(3, 5) + "日");
                isDate = true;
            } else {
                System.out.println("日期格式錯誤！(請輸入YYYY/MM/DD或MM/DD/YYYY且請輸入正確的月份及日期)");
                isDate = false;
            }
        } while (!isDate);
    }
}
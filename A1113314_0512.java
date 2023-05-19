import java.util.*;

class DumplingShopSimulator {
    private static final int PORK_DUMPLINGS = 5000;
    private static final int BEEF_DUMPLINGS = 3000;
    private static final int VEGETABLE_DUMPLINGS = 1000;

    private static final int MIN_DUMPLINGS_PER_ORDER = 10;
    private static final int MAX_DUMPLINGS_PER_ORDER = 50;

    private static final int WAIT_TIME = 3000; 

    private int porkDumplingsRemaining;
    private int beefDumplingsRemaining;
    private int vegetableDumplingsRemaining;

    private Random random;

    public DumplingShopSimulator() {
        porkDumplingsRemaining = PORK_DUMPLINGS;
        beefDumplingsRemaining = BEEF_DUMPLINGS;
        vegetableDumplingsRemaining = VEGETABLE_DUMPLINGS;
        random = new Random();
    }

    public synchronized boolean hasDumplings() {
        return porkDumplingsRemaining > 0 || beefDumplingsRemaining > 0 || vegetableDumplingsRemaining > 0;
    }

    public synchronized boolean serveCustomer(int numCustomers) throws InterruptedException {
        for (int i = 0; i < numCustomers; i++) {
            if (!hasDumplings()) {
                return false; 
            }

            int numDumplings = random.nextInt(MAX_DUMPLINGS_PER_ORDER - MIN_DUMPLINGS_PER_ORDER + 1) + MIN_DUMPLINGS_PER_ORDER;
            String dumplingType = getRandomDumplingType();
            System.out.println("顧客點餐：" + numDumplings + "顆" + dumplingType);

            if (dumplingType.equals("豬肉水餃") && porkDumplingsRemaining > 0) {
                porkDumplingsRemaining--;
                System.out.println("服務生製作豬肉水餃");
            } else if (dumplingType.equals("牛肉水餃") && beefDumplingsRemaining > 0) {
                beefDumplingsRemaining--;
                System.out.println("服務生製作牛肉水餃");
            } else if (dumplingType.equals("蔬菜水餃") && vegetableDumplingsRemaining > 0) {
                vegetableDumplingsRemaining--;
                System.out.println("服務生製作蔬菜水餃");
            } else {
                System.out.println("很抱歉，您點的水餃種類暫時無法提供");
                continue;
            }

            Thread.sleep(WAIT_TIME); 

            System.out.println("顧客享用美味水餃");
        }

        return true; 
    }

    private String getRandomDumplingType() {
        int randomNum = random.nextInt(3);
        switch (randomNum) {
            case 0:
                return "豬肉水餃";
            case 1:
                return "牛肉水餃";
            case 2:
                return "蔬菜水餃";
            default:
                return "";
        }
    }
}

public class A1113314_0512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入同時光顧的顧客數目：");
        int numCustomers = scanner.nextInt();

        DumplingShopSimulator simulator = new DumplingShopSimulator(); 
        
        try {
            while (simulator.hasDumplings()) {
                if (!simulator.serveCustomer(numCustomers)) {
                    System.out.println("抱歉，水餃售完了！");
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
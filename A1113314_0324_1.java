import java.util.*;

class animal {
    String name;
    double height;
    int weight;
    double speed;

    void show() {
        System.out.println("姓名：" + this.name);
        System.out.println("身高：" + this.height);
        System.out.println("體重：" + this.weight);
        System.out.println("速度：" + this.speed);
    }
    double distance(double x, double y) {
        return x * y * this.speed;
    }
    double distance(double x) {
        return x * this.speed;
    }
}

public class A1113314_0324_1 {
    public static void main(String[] argv) {
        animal[]animals = new animal [4];

        String[]name ={"雪寶","驢子","安那","愛沙"};
        double[]height ={1.1,1.5,1.7,1.7};
        int[]weight ={52,99,48,50};
        double[]speed ={100,200,120,120};

        for(int i = 0 ;i<4;i++){
            animals[i] = new animal();
            animals[i].name = name[i];
            animals[i].height = height[i];
            animals[i].weight = weight[i];
            animals[i].speed = speed[i];
            animals[i].show();
        }

        Scanner Sc = new Scanner(System.in);

        for(animal A:animals){
            System.out.println("請輸入"+A.name+"的時間(X)：");
            double x=Sc.nextDouble();
            System.out.println("請輸入"+A.name+"的加速度(Y)：");
            double y=Sc.nextDouble();
            double dist;
            if(y>0)
                dist = A.distance(x,y);
            else 
                dist = A.distance(x);
            System.out.println(A.name+"跑的距離為"+dist);
        }
    }
}

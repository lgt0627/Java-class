package pangu.com.day204;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int sum = 0, avg = 0;
            System.out.println("输入第" + i + "班:");
            for (int j = 0; j < 10; j++) {
                double[] fenshu = new double[10];
               fenshu[j]= sc.nextDouble();
                sum += fenshu[j];
            }
            avg = sum / 10;
            System.out.println(i + "班总数：" + sum);
            System.out.println(i + "班平均：" + avg);
        }

    }
}

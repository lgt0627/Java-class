package pangu.com.day201;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输人第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输人第二个数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int num3 = sc.nextInt();

        int y=0;
        int z=0;
        y=getMin(num1, num2, y);
        z=getMin(y, num3, z);


        System.out.println(num1 + num2 + num3);
        System.out.println(z);
    }


    public static int getMin(int m, int n, int a) {
        if (m > n) {
             a = m - n;
        }
        if (m < n) {
             a = n- m;
        }
        return a;
    }

}
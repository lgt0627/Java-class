package pangu.com.day203;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = s.nextInt();

        if (((i % 5 == 0) || (i % 6 == 0)) && (i %30 != 0))
            System.out.println("能被5或6整除，但不能被两者同时整除的数");
        else
            return ;

    }
}

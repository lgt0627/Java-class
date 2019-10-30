package pangu.com.day202;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=s.nextInt();
        if(a%2==0) System.out.println("偶数");
        else System.out.println("奇数");

    }
}

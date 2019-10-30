package pangu.com.day203;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=s.nextInt();
        int i;
        int num1=0;
       if(num<10){
            System.out.println("结果： "+num);
        }else{
            while(num>0){
                i = num % 10;
                num = num / 10;
                num1 = num1 * 10 + i;
            }
            System.out.println("结果： "+num1);
        }
    }
}

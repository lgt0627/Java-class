package pangu.com.day205;

import java.util.Scanner;

public class ex02
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个小于八位的整数");
        int num=s.nextInt();
        int [] array=new int[8];
        int count=0;
        for (int i = 0; i < 8; i++) {
            array[i]=((num%10)+5)%10;
            num/=10;count++;
            if(num==0)break;

        }
        int temp=array[0];
        array[0]=array[count-1];

        array[count-1]=temp;

        System.out.print("加密后数字为:"+"");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]);
        }
    }

}

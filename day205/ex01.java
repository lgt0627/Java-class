package pangu.com.day205;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int[] array = new int[100000];
        int length = 0;
        int a = 0;//奇数个数
        int b = 0;//偶数个数
        System.out.println("请任意输入数字，直至输入-1输入结束");
        for (int i = 0; i < array.length; i++) {
            int m = s.nextInt();
            if (m==-1) break;
            array[i] = m;
            length++;
        }
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) b++;
            else a++;
        }
        System.out.println(+a+","+b);

    }
}

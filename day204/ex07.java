package pangu.com.day204;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int length = array.length;
        System.out.println("输入十个数");
        Scanner s = new Scanner(System.in);
        for (int a = 0; a < length; a++) {
            array[a] = s.nextInt();
        }
        System.out.println("输入一个你想要查询的数");
        int searchnumber = s.nextInt();
        int m = -1;
        for (int i = 0; i < length; i++) {
            if (array[i] == searchnumber)
            { System.out.println(i);
            m++;}
        }
        if (m == -1)
            System.out.println("你查得数不在数组中");
    }
}

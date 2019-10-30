package pangu.com.day203;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入五个整数");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int max, min;
        max =max(a, b);
        max=max(max,c );
        max=max(max,d);
        max=max(max,e);
        min=min(a,b);
        min=min(min,c);
        min=min(min,d);
        min=min(min,e);

        System.out.println("max=" + max + "min=" + min);
    }

    public static int max(int x, int y) {
        int max;
        if (x >= y) max = x;
        else max = y;
        return max;

    }

    public static  int min(int x, int y) {
        int min;
        if (x <= y) min = x;
        else min = y;
        return min;
    }
}
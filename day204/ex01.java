package pangu.com.day204;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("乘法口诀请问你要几行？");
        int x=s.nextInt();
        System.out.println("你要几列");
        int y=s.nextInt();
        for( int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println("");
        }
    }
}

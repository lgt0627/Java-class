package pangu.com.day102901;

import java.util.Scanner;

/**
 * Created on 2019/10/29 6:44 下午
 *
 * @author lgt
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("随便输一段");
        String p1=s.nextLine();
        char []p=p1.toCharArray();
        char []p2=new char[p.length];
        char []p3=new char[p.length];
        int count=0;int count1=0;
        for (int i = 0; i <p.length; i++) {
            if((p[i]>='a'&&p[i]<='z')||(p[i]>='A'&&p[i]<='Z')){
                p2[count]=p[i];
                count++;

            }
            else {p3[count1]=p[i];count1++;}
        }
        System.out.println("大小写的字符的个数"+count+"个。 他们是:");

        for (int j = 0; j <count ; j++) {
            System.out.print(p2[j]);
        }
        System.out.println();
        System.out.println("非大小写字符的个数"+count1+"个.他们是：");
        for (int m = 0; m <count1 ; m++) {
            System.out.print(p3[m]);

        }

    }
}

package pangu.com.day204;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("输入十个数");
        int [] array=new int[10];
        int [] newarray=new int[10];
        for(int i=0;i<10;i++){
            array[i]=s.nextInt();
            newarray[i]=array[i];
        }
        System.out.print("newarray={");
        for(int m=0;m<10;m++){
            System.out.print(+newarray[m]+",");
        }
        System.out.println("}");
    }
}

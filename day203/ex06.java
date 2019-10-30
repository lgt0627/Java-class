package pangu.com.day203;


import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int count=0;//计数
        for(int i=0;i<=10;i++){


            if(i==(int)(Math.random() * 30)+1){
                count++;
            }

        }
        System.out.println("一共有"+count+"次相同");

    }
}

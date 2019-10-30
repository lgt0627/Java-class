package pangu.com.day204;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] goal=new int[8];
        int max=0;
        int min=1000;
        int sum=0;
        int aver=0;
        System.out.println("输入八个同学的成绩");
        for (int i = 0; i < 8; i++) {
            goal[i]=s.nextInt();
            sum+=goal[i];
            if(goal[i]>=max)max=goal[i];
            else min=goal[i];
        }
        aver=sum/8;
        System.out.println("平均分"+aver+"总分"+sum+"最高分"+max+"最低分"+min);
    }
}

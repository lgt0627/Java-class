package pangu.com.day203;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入五个学生的成绩");
        double stu1=s.nextInt();
        double stu2=s.nextInt();
        double stu3=s.nextInt();
        double stu4=s.nextInt();
        double stu5=s.nextInt();
        System.out.println("五个人的总成绩是："+(stu1+stu2+stu3+stu4+stu5));
    }
}

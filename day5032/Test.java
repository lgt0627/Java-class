package pangu.com.day5032;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] stu = new Student[6];
        for (int i = 0; i < 6; i++) {
            stu[i] = new Student(1 + i, "lgt" + (i+1));
        }//确认六个学生
        Question[] que = new Question[30];
        for (int j = 0; j < 30; j++) {
            que[j] = new Question(1 + j, j + "+1=?"+"\t"+"A:"+(j+1)+"\t"+"B:"+(j+2)+"\t"+"C:"+(j-1)+"\t"+"D:"+(j-2));
            que[j].setAnswer("A");
        }//确认题目
        System.out.println("请输入你的姓名");
        Scanner s = new Scanner(System.in);
        String na = s.next();
        int p = -1;int count=0;int []array=new int[11];
        for (int m = 0; m < 6; m++) {
            if (na.equals(stu[m].getStuName())) {
                p = m;
                break;
            }
        }
        if (p == -1) {
            System.out.println("名字错误，请重新进入程序");
            return;
        }//确认学生身份
        else {
            for (int n = 1; n <=10; n++) {
                array[0]=(int)(1+Math.random()*3);
                array[n]=(int)(array[n-1]+1+Math.random()*3);
                System.out.println(que[array[n-1]].getTitle());
                System.out.println("请输入你的答案");
                Scanner print=new Scanner(System.in);
                if(print.next().equals(que[(int)(1+n+Math.random()*3)].getAnswer()))
                    count++;//计数答对几题
            }
        }
        System.out.println("你的得分是:"+(count*5));
    }
}

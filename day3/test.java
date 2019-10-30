package pangu.com.day3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1------添加一个新人物，2------删除一个新人物，3-----查找人物");
        int i = s.nextInt();
        switch (i) {
            case 1: add();break;
            case 2: delete();break;
            case 3: search();break;
        }


    }

    static void add() {
        System.out.println("请输入新人物的名字");
        Scanner m=new Scanner(System.in);
        String name=m.next();
        System.out.println("年龄");
        int age=m.nextInt();
        System.out.println("性别");
        String sex=m.next();
        po1.array[po1.count++]=new person(name,age,sex);
        display();

    }
    static void delete(){
        for (int j = 0; j <po1.count ; j++) {
            System.out.println(po1.array[j]);
        }
        System.out.println("你要删除第几个数据");
        Scanner m=new Scanner(System.in);
        int num=m.nextInt();
        for (int i = num-1; i <po1.count-1; i++) {
            po1.array[i]=po1.array[i+1];
        }
        po1.count--;
        System.out.println("剩下的人物为");
        display();
    }
    static void search(){
        System.out.println("一共有"+po1.count+"个人物，那你要看第几个？");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.println(po1.array[m-1]);

    }
   static  void display(){
       for (int j = 0; j <po1.count ; j++) {
           System.out.println(po1.array[j]);

       }
   }
}

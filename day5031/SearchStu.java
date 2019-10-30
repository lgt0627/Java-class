package pangu.com.day5031;

import java.util.Scanner;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
public class SearchStu {
    public static void main(String[] args) {

            Class[] classes =new Class[3];
            classes[0]=new Class("盘古班","001");
            classes[1]=new Class("春秋班","002");
            classes[2]=new Class("战国班","003");
            classes[0].stu=new Student[10];
            classes[1].stu=new Student[10];
            classes[2].stu=new Student[10];

            for (int i = 0; i < 10; i++) {
              classes[0].stu[i]=new Student("lgt"+i,14+i,"盘古班");
              classes[1].stu[i]=new Student("lgt"+(10-i),14+i,"春秋班");
              classes[2].stu[i]=new Student("lgt"+(12-i),13+i,"战国班");
            }

        System.out.println("请输入你要找的同学名");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        for (int m = 0; m <3 ; m++) {
            for (int j = 0; j < 10; j++) {
                if (name.equals(classes[m].stu[j].getName())) {
                    System.out.println(classes[m].stu[j].toString());
                }

            }
        }

    }
}


package pangu.com.day501.ex05;


import java.util.Scanner;

public class CreatTeacher {
    public static void main(String[] args) {
        System.out.println("情输入老师的ID，名字，性别，年龄，身高");
        Scanner s = new Scanner(System.in);
        Teacher teacher = new Teacher();
        teacher.setId(s.nextInt());
        teacher.setName(s.next());
        teacher.setSex(s.next());
        teacher.setAge(s.nextInt());
        teacher.setHeight(s.nextDouble());
        System.out.println(teacher.toString());
    }
}

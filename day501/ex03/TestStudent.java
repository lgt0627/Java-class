package pangu.com.day501.ex03;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        System.out.println("情输入学生的名字，性别，年龄，专业");
        Scanner s=new Scanner(System.in);
        Student student=new Student();
        student.setName(s.next());
        student.setSex(s.next());
        student.setAge(s.nextInt());
        student.setDire(s.next());
        System.out.println(student.toString());
    }
}

package pangu.com.day502.ex01;

import pangu.com.day502.ex01.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        System.out.println("情输入第一个学生的id,名字，性别，年龄");
        Scanner s = new Scanner(System.in);
        Student student = new Student();
        student.setId(s.nextInt());
        student.setName(s.next());
        student.setSex(s.next());
        student.setAge(s.nextInt());

        System.out.println("请输入第二个学生的id,名字，性别，年龄");
        Scanner m = new Scanner(System.in);
        Student student1 = new Student(s.nextInt(), s.next(), s.next(), s.nextInt());
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}


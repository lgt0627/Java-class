package pangu.com.day501.ex03;

import java.util.Scanner;

/**
 * 1) 创建一个学生类
 * 2) 创建四个私有的字段:name,sex,age,dire
 * 3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,age 1-60,dire方向只能是.net或java
 * 4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息
 */

public class Student {
    private String name;
    private String sex;
    private int age;
    private String dire;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDire() {
        return dire;
    }

    public void setName(String name) {
        while (name.length() > 4) {
            System.out.println("请输入四个字以内的名字");
            Scanner u = new Scanner(System.in);
            name = u.next();
        }
        this.name = name;
    }

    public void setSex(String sex) {
        while((sex.equals("男") || sex.equals("女"))==false) {
            System.out.println("请输入正确的性别：男或女");
            Scanner u = new Scanner(System.in);
            sex=u.next();
        }
      this.sex=sex;
    }

    public void setAge(int age) {
        while(age < 1 || age > 60) {
            System.out.println("年龄应该在1-60");
            Scanner u=new Scanner(System.in);
            age=u.nextInt();
        }
        this.age = age;

    }

    public void setDire(String dire) {
        while((dire.equals(".net") || dire.equals("java"))==false){
        System.out.println("请输入 .net 或 java");
        Scanner u=new Scanner(System.in);
        dire=u.next();
        }
        this.dire = dire;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dire='" + dire + '\'' +
                '}';
    }
}

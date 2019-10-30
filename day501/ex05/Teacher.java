package pangu.com.day501.ex05;

import java.util.Scanner;

public class Teacher {

    private int id;
    private String name;
    private String sex;
    private int age;
    private double height;

    public int getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        while (name.length() > 4|| name.length()<1) {
            System.out.println("请输入一到四个字以内的名字");
            Scanner u = new Scanner(System.in);
            name = u.next();
        }
        this.name = name;
    }

    public void setSex(String sex) {
        while ((sex.equals("男") || sex.equals("女")) == false) {
            System.out.println("请输入正确的性别：男或女");
            Scanner u = new Scanner(System.in);
            sex = u.next();
        }
        this.sex = sex;
    }

    public void setAge(int age) {
        while (age < 20 || age > 25) {
            System.out.println("年龄应该在20-25");
            Scanner u = new Scanner(System.in);
            age = u.nextInt();
        }
        this.age = age;

    }

    public void setHeight(double height) {
        while (height<1.50||height>1.80) {
            System.out.println("请输入正确的身高：1.50-1.80");
            Scanner u = new Scanner(System.in);
            height = u.nextDouble();
        }
        this.height=height;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

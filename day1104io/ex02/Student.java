package pangu.com.day1104io.ex02;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Comparator;

/**
 * Created on 2019/11/5 1:05 下午
 *
 * @author lgt
 */
public class Student implements Serializable, Comparable<Student>{
    private String number;
    private String name;
    private String password;
    private int age;
    private String Class;

    public Student(String number, String name, String password, int age, String aClass) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.age = age;
        Class = aClass;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getInformation(String name) {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }


    public int getAge() {
        return age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        return  o.age-this.age;
    }
}

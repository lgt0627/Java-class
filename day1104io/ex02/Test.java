package pangu.com.day1104io.ex02;

import java.io.*;
import java.util.*;

/**
 * Created on 2019/11/5 1:07 下午
 *练习2：将一个集合里面的学生对象存储到指定的文件中去，每个学生信息单独占一行，学生的属性之间用英文逗号隔开
 * 学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级
 * 要求:1.学生选择登陆功能,如果文件中没有该学生的信息那么就得注册
 *          2.根据输入的学生的姓名获取指定学生的所有信息
 *          3.根据所有学生的年龄进行降序排序
 * @author lgt
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("studentInformation.txt");
        List <Student>list=new ArrayList<Student>();
        list.add(new Student("001","lgt1","1234561",27,"101"));
        list.add(new Student("002","lgt2","1234562",45,"102"));
        list.add(new Student("003","lgt3","1234563",13,"103"));
        list.add(new Student("004","lgt4","1234564",67,"104"));

        ObjectOutputStream  oos =new ObjectOutputStream(new FileOutputStream(file));
        for (Student c:list) {
            oos.writeObject(c);
        }
        oos.close();
        System.out.println("输入你的名字");
        Scanner ss=new Scanner(System.in);
        String name=ss.next();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        Student []students=new Student[list.size()];
        Student line= (Student) ois.readObject();

         int count1=0;int count=0;
        while(line !=null) {
            students[count]=line;
            if (name.equals(((Student)line).getName())){
                System.out.println("该学生的详细信息如下：");
                System.out.println(line);
                count1=-1;

            }
            count++;
            if(count>=list.size()) {
                count--;
                break;
            }
            line = (Student) ois.readObject();
        }
        if(count1==0) {
            System.out.println("请你注册新账号");
            System.out.println("拜拜");
            System.exit(0);
        }
        ois.close();
        System.out.println("\n"+"按年龄降序");
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-1-i ; j++) {
                if(students[j].getAge()<students[j+1].getAge()){
                    Student temp=students [j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }

            }

        }
        for (Student sss:students) {
            System.out.println(sss.toString());

        }
    }



    }



package pangu.com.day1102set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created on 2019/11/3 10:46 上午
 *
 * @author lgt
 */
public class Ex03 {
    public static void main(String[] args) {
        int sum = 5;
        Scanner s = new Scanner(System.in);
        HashSet<Student> hashSet = new HashSet();
        for (int i = 0; i < sum; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的名字及语数外成绩");
            String name = s.next();
            Double cG = s.nextDouble();
            Double eG = s.nextDouble();
            Double mG = s.nextDouble();
            hashSet.add(new Student(name, cG, eG, mG));
        }

        Student[] students = new Student[sum];
        int i = 0;
        Iterator<Student> integer = hashSet.iterator();
        while (integer.hasNext()) {
            students[i] = (Student) integer.next();
            i++;
        }
        for (int j = 0; j< students.length-1 ; j++) {
            for (int m = 0; m < students.length-j-1; m++) {
                Student count = new Student();
                count = students[m];
                if (students[m].getChineseGrade() < students[m+1].getChineseGrade()) {
                    students[m] = students[m+1];
                    students[m+1] = count;
                }

            }
        }

        for (int l = 0; l < students.length; l++) {
            System.out.println(students[l]);

        }
    }
}


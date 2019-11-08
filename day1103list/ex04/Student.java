package pangu.com.day1103list.ex04;

/**
 * Created on 2019/11/3 2:43 下午
 *
 * @author lgt
 */
public class Student {
    private String name;
    private String banJi;
    private double grade;

    public Student(String name, String banJi, double grade) {
        this.name = name;
        this.banJi = banJi;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", banJi='" + banJi + '\'' +
                ", grade=" + grade +
                '}';
    }
}

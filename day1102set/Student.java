package pangu.com.day1102set;

/**
 * Created on 2019/11/3 10:47 上午
 *
 * @author lgt
 */
public class Student {
    private String name;
    private double chineseGrade;
    private double englishGrade;
    private double mathsGrade;

    public Student() {
    }

    public Student(String name, double chineseGrade, double englishGrade, double mathsGrade) {
        this.name = name;
        this.chineseGrade = chineseGrade;
        this.englishGrade = englishGrade;
        this.mathsGrade = mathsGrade;
    }

    public double getChineseGrade() {
        return chineseGrade+englishGrade+mathsGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseGrade=" + chineseGrade +
                ", englishGrade=" + englishGrade +
                ", mathsGrade=" + mathsGrade +
                '}';
    }
}

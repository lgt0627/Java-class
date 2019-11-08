package pangu.com.day1031;

/**
 * Created on 2019/10/31 6:34 下午
 *
 * @author lgt
 */
public class Course {
    private String nameCourse;
    private double grade;

    public Course(String nameCourse, double grade) {
        this.nameCourse = nameCourse;
        this.grade = grade;
    }

    public Course() {
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}

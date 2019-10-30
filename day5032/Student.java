package pangu.com.day5032;

public class Student {
    private int stuNum;
    private String stuName;
    private String stuGrade="一年级";
    private String stuScore;

    public Student(int stuNum, String stuName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
//        this.stuGrade = stuGrade;
    }

    public String getStuName() {
        return stuName;
    }

    @Override
    public String toString() {
        return
                "你的得分是'" + stuScore + '\''
                ;
    }



}

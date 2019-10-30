package pangu.com.day5031;

public class Class {
    private String className;//班级民
    private String classId;//编号
    Student []stu=new Student[10];
    public  Class(String className, String classId) {
        this.className = className;
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

}

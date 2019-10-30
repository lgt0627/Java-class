package pangu.com.day3;

public class person {

    private String name;
    private int age;
    private String sex;

    public person(String name,int age,String sex) {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
public person(){

}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}


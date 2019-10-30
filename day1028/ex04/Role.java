package pangu.com.day1028.ex04;

/**
 * @author lgt
 */
public abstract class Role {
    private String name;
    private int age;

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    abstract void play();

    public Role() {
        System.out.println("无参构造！");
    }
    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

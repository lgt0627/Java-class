package pangu.com.day1028.ex04;

/**
 * @author lgt
 */
public class Employee extends Role{
    private int salary;
    static int ID;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int iD) {
        ID = iD;
    }

    @Override
    public void play() {
        System.out.println("我在玩！！");

    }

    final public void sing() {
        System.out.println("我在唱歌！!");
    }

    public Employee() {
        System.out.println("Employee的无参构造器！");
    }
    public Employee(int salary) {
        super();
        this.salary = salary;
        System.out.println("Emoployee的有参构造器！");
    }

}

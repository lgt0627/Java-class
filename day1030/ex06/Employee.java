package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 6:58 下午
 *
 * @author lgt
 */
public class Employee extends Employees {

        private double salary;
        private String name;
        public Employee() {
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}

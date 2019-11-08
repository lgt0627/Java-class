package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 8:15 下午
 *
 * @author lgt
 */
public class EmployeeMake extends Employee implements EmployeeSalary{
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public double salaryCounter() {
        return getCount()*50;
    }
}

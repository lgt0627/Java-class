package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 7:36 下午
 *
 * @author lgt
 */
public class EmployeeTime extends Employee implements EmployeeSalary {
    private int clock;

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }



    @Override
    public double salaryCounter() {
        return clock*10.00;
    }
}

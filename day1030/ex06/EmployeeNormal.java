package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 8:06 下午
 *
 * @author lgt
 */
public class EmployeeNormal extends Employee implements EmployeeSalary {
    private int clock;
    private double staticMoney=4000;

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public double getStaticMoney() {
        return staticMoney;
    }

    public void setStaticMoney(double staticMoney) {
        this.staticMoney = staticMoney;
    }

    @Override
    public double salaryCounter() {
        if(getClock()<=196) {return staticMoney;}
        else {return staticMoney+200*(getClock()-196); }
    }
}

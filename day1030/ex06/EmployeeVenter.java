package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 7:40 下午
 *当销售额再10000 以下时，则提成10%，
 * 等销售额再10000-100000之间是，则提成15%。
 * 再 100000以上是，提成18%。
 * @author lgt
 */
public class EmployeeVenter extends Employee implements EmployeeSalary{
    private double venteMoney;
    //销售总额
    private double staticMoney=4000;
    //基本工资


    public double getVenteMoney() {
        return venteMoney;
    }

    public void setVenteMoney(double venteMoney) {
        this.venteMoney = venteMoney;
    }

    public double getStaticMoney() {
        return staticMoney;
    }

    public void setStaticMoney(double staticMoney) {
        this.staticMoney = staticMoney;
    }

    @Override
    public double salaryCounter() {
        if(venteMoney<10000)return staticMoney+venteMoney*0.10;
        else if(venteMoney>=10000&&venteMoney<100000)return staticMoney+venteMoney*0.15;
        else return staticMoney+venteMoney*0.18;
    }
}

package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 7:15 下午
 *
 * @author lgt
 */
public class Company {
    public static void main(String[] args) {
        EmployeeTime em1=new EmployeeTime();
        em1.setClock(200);
        em1.add("小时工甲",em1.salaryCounter());
        EmployeeTime em2=new EmployeeTime();
        em2.add("小时工乙",em2.salaryCounter());
        EmployeeVenter em3=new EmployeeVenter();
        em3.setVenteMoney(5000);
        em3.add("销售员甲",em3.salaryCounter());
        EmployeeVenter em4=new EmployeeVenter();
        em4.setVenteMoney(200000);
        em4.add("销售员乙",em4.salaryCounter());
        EmployeeNormal em5=new EmployeeNormal();
        em5.setClock(205);
        em5.add("普通员工",em5.salaryCounter());
        double sumbrary=em1.salaryCounter()+em2.salaryCounter()+em3.salaryCounter()+em5.salaryCounter()+em4.salaryCounter();

        System.out.println("发工资总和为"+sumbrary);
        EmployeeMake em6=new EmployeeMake();
        em6.setCount(30);
        em6.add("首饰工人",em6.salaryCounter());
        sumbrary+=em6.salaryCounter();
        System.out.println("加了首饰工人的总发工资为"+sumbrary);



    }
}

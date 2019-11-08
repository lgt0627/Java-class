package pangu.com.day1030.ex06;

/**
 * Created on 2019/10/30 7:26 下午
 *
 * @author lgt
 */
public class Employees {

    Employee []sum=new Employee[20];
    int num=0;
    public int add(String name,double salary){
        sum[num]  =new Employee();
        sum[num].setName(name);
        sum[num].setSalary(salary);
        return num++;
    }
    public void showMoney(String name){
        for (int i = 0; i <num ; i++) {
            if(name.equals(sum[i].getName())){
                System.out.println(sum[i].getSalary());
            }

        }

    }

    public void showMoneyAll(){
        int money=0;
        for (int i = 0; i <=num ; i++) {
            money+=sum[i].getSalary();

        }
        System.out.println("工资总和是"+money);
    }
    public int delete(String name){
        int m=-1;
        for (int i = 0; i <num ; i++) {
            if (name.equals(sum[i].getName())) {
                m=i;
            }
        }
        for (int i = m; i < num; i++) {
            sum[i]=sum[i+1];
             num--;
        }
        return num;
    }
}

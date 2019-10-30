package pangu.com.day502.ex04;

public class Count {
    private String id="34*******96666";//卡号
    private String name="刘国泰";//姓名
    private String  openDate="2019-10-25";//开户日期
    private String idCard="123*****90";//银行卡卡号
    private double money=5210.00;//余额

    public Count( double money) {
        this.money = money;
    }
public Count(){

}

    @Override
    public String toString() {
        return "Count{" +
                "卡号='" + id + '\'' +
                ", 用户名='" + name + '\'' +
                ", 开户时间='" + openDate + '\'' +
                ", 身份证='" + idCard + '\'' +
                ", 余额=" + money +
                '}';
    }

    public void save(double inmoney){//存钱
        money+=inmoney;
        viewmoney();
    }
    public void draw(double outmoney){//取钱
       money-=outmoney;
       viewmoney();
    }
    public void viewdate(){
        System.out.println(openDate);
    }
    public void viewmoney(){
        System.out.println(money);
    }
}

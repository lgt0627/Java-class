package pangu.com.day1107xiancheng.ex01;

/**
 * Created on 2019/11/7 3:45 下午
 *
 * @author lgt
 */
public class MyThread {
    public static void main(String[] args) {


        Num num = new Num();
        Printer2 printer2 = new Printer2(num);
        Printer1 printer1 = new Printer1(num);
        Printer3 printer3 = new Printer3(num);
        Thread p1=new Thread(printer1);
        p1.setName("A");
        Thread p2=new Thread(printer2);
        p2.setName("B");
        Thread p3=new Thread(printer3);
        p3.setName("C");
        p1.start();
        p2.start();
        p3.start();

    }


}

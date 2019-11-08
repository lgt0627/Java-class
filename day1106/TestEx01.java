package pangu.com.day1106;

import pangu.com.day1106.Ex01;

/**
 * Created on 2019/11/6 5:21 下午
 *
 * @author lgt
 */
public class TestEx01 {
    public static void main(String[] args) throws InterruptedException {
        Ex01 m = new Ex01();
        Thread p1=new Thread(m);
        p1.setName("A");
        Thread p2=new Thread(m);
        p2.setName("B");
        p1.start();
        p2.start();
    }
}

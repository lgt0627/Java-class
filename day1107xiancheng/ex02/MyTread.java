package pangu.com.day1107xiancheng.ex02;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created on 2019/11/7 6:45 下午
 *
 * @author lgt
 */
public class MyTread {
    public static void main(String[] args) {
        Num num=new Num();
        Plus p1=new Plus(num);
        Plus1 p2=new Plus1(num);
        Multiply m1 = new Multiply(num);
        Multiply1 m2 = new Multiply1(num);

        ExecutorService ex= Executors.newFixedThreadPool(2);
        ExecutorService ex1=Executors.newFixedThreadPool(2);
        ex.submit(p1);
        ex.submit(p2);
        ex1.submit(m1);
        ex1.submit(m2);
        ex.shutdown();
        ex1.shutdown();
    }
}

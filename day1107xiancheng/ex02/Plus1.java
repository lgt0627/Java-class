package pangu.com.day1107xiancheng.ex02;

/**
 * Created on 2019/11/7 7:07 下午
 *
 * @author lgt
 */
public class Plus1 implements Runnable {
    Num p = new Num();

    public Plus1(Num p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            Thread.currentThread().setName("B");
            p.i++;
            System.out.println(Thread.currentThread().getName() + "：i+1=" + p.i);
        }
    }
}
package pangu.com.day1107xiancheng.ex02;

/**
 * Created on 2019/11/7 7:07 下午
 *
 * @author lgt
 */
public class Multiply implements Runnable{
    Num p=new Num();
    public Multiply(Num p){
        this.p=p;
    }

    @Override
    public void run() {
        synchronized (p) {
            Thread.currentThread().setName("C");
            p.i--;
            System.out.println(Thread.currentThread().getName() + "：i-1=" + p.i);
        }
    }
}

package pangu.com.day1107xiancheng.ex03;

/**
 * Created on 2019/11/7 6:12 下午
 *
 * @author lgt
 */
public class B2 implements Runnable {
    Num p = new Num();

    public B2(Num p) {
        this.p = p;

    }

    @Override
    public void run() {
        while(true){
        synchronized (p) {
            if (p.count == 1) {
                p.count++;
                p.count1++;
                System.out.println(Thread.currentThread().getName() + "在执行");

            }
            try {
                p.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
    }
}
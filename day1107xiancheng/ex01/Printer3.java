package pangu.com.day1107xiancheng.ex01;

/**
 * Created on 2019/11/7 3:53 下午
 *
 * @author lgt
 */
public class Printer3 implements Runnable {
    Num p;

    public Printer3(Num p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (p) {
                    if (p.count == 2) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + ":" + (p.a)++);
                    }
                        if (p.a >= 75) {
                            System.exit(0);
                        }
                    p.notifyAll();
                    p.count = 0;

                }

            }

        }
    }
}
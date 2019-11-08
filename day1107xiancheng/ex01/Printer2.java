package pangu.com.day1107xiancheng.ex01;

/**
 * Created on 2019/11/7 3:53 下午
 *
 * @author lgt
 */
public class Printer2 implements Runnable {
    Num p;

    public Printer2(Num p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            if (p.a <= 75) {
                synchronized (p) {
                    if (p.count == 1) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + (p.a)++);
                        }
                        p.count++;
                        try {
                            p.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
            else {
                break;
            }
        }

    }
}
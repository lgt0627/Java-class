package pangu.com.day1107xiancheng.ex03;

/**
 * Created on 2019/11/7 6:12 下午
 *
 * @author lgt
 */
public class C3 implements Runnable {
    Num p=new Num();
    public C3(Num p){
        this.p=p;

    }
    @Override
    public void run() {
        while(true) {
            synchronized (p) {
                if (p.count == 2) {
                    p.count=0;
                    p.count1++;
                    System.out.println(Thread.currentThread().getName() + "在执行");

                }
                if(p.count1==12){
                    System.out.println("已经循环四次了 小哥哥 好累啊");
                    System.exit(0);
                }
                p.notifyAll();

            }
        }

    }
}

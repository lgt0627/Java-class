package pangu.com.day1106;

/**
 * Created on 2019/11/6 5:18 下午
 * 模范  一个账户 1000块钱 :两个人 A B  分别在柜台和ATM机 取钱  A每次取钱100  B每次取200   最终在控制台输出每个人取钱数
 * @author lgt
 */
public class Ex01 implements Runnable {
    int money = 0;
    int sum = 1000;
    static int count = 0;
    static int count1 = 0;
    @Override
    public void run() {
        int get = 0;
        String s = "A";
        if (s.equals(Thread.currentThread().getName())) {
            get = 100;
        } else {
            get = 200;
        }

        while (true) {
            synchronized (this) {
                if ((money + get) <sum) {
                    money += get;
                    System.out.println(Thread.currentThread().getName() + "取了" + get);
                    if (get == 100) {
                        count += get;
                    }
                    if (get == 200) {
                        count1 += get;
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if ((money + get) ==sum) {
                    System.out.println(Thread.currentThread().getName() + "取了" + get+"\n");
                    System.out.println("ATM机破产了，还有取钱业务的客户请前往柜台办理！谢谢您的配合！"+"\n");

                    if (get == 100) {
                        count += get;
                        System.out.println("A一共取了"+count);
                        System.out.println("B一共取了"+(sum-count));
                        System.exit(0);
                    }
                    if (get == 200) {
                        count1 += get;
                        System.out.println("A一共取了"+(sum-count1));
                        System.out.println("B一共取了"+count1);
                        System.exit(0);

                    }



                }else {
                    break;
                }

                }
             }

    }
}






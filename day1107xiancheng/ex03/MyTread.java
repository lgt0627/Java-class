package pangu.com.day1107xiancheng.ex03;

/**
 * Created on 2019/11/7 6:11 下午
 * 四个线程 其中A,B线程对每次对i增加1  C.D线程每次对i减1
 *
 * @author lgt
 */
public class MyTread {
    public static void main(String[] args) {
        Num num = new Num();
        A1 a1 = new A1(num);
        B2 b2 = new B2(num);
        C3 c3 = new C3(num);

        Thread A = new Thread(a1);
        A.setName("A");
        Thread B = new Thread(b2);
        B.setName("B");
        Thread C = new Thread(c3);
        C.setName("C");

        A.start();
        B.start();
        C.start();

    }

}

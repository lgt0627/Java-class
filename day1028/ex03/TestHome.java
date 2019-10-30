package pangu.com.day1028.ex03;

/**
 * @author lgt
 */
public class TestHome {
    public static void main(String[] args) {
        System.out.println("三个人是这么回家的");
        System.out.println("");
        new Wang().ticket();
        new Wang().method();
        new Wang().back();
        new Li().ticket();
        new Li().method();
        new Li().back();
        new Ming().ticket();
        new Ming().method();
        new Ming().back();
    }
}

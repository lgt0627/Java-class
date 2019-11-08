package pangu.com.day1030.ex02;

/**
 * Created on 2019/10/30 5:46 下午
 *
 * @author lgt
 */
public class StringBuff {
    public static void main(String[] args) {
        StringBuffer buff=new StringBuffer();
        buff.append("qwertyuiopasdfghjklzxcvbnm");
        buff.delete(0,6);
        System.out.println(buff.reverse());


    }
}

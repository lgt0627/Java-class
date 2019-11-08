package pangu.com.day1030.ex03;

import java.util.Scanner;

/**
 * Created on 2019/10/30 5:51 下午
 *
 * @author lgt
 */
public class Ex03 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("我是一个字符串,我也是你爸爸");
        System.out.println();
        System.out.println(stringBuffer);
        System.out.println("你要从第几个字到第几个字倒序");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(stringBuffer.substring(0,a-1)
                +stringBuffer.reverse().substring(a,b+1)
                +stringBuffer.reverse().substring(b-1));
    }
}

package pangu.com.day1030.ex04;

import pangu.com.day1030.ex02.StringBuff;

/**
 * Created on 2019/10/30 6:16 下午
 *
 * @author lgt
 */
public class Ex04 {
    public static void main(String[] args) {
        String string=new String("To be or not to be");
        String[] array=string.split(" ");

        for (int i = 0; i <array.length ; i++) {
           StringBuffer stringBuffer=new StringBuffer();
            System.out.print(stringBuffer.append(array[i]).reverse()+" ");

        }
    }
}

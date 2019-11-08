package pangu.com.day1102set;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created on 2019/11/3 10:41 上午
 *
 * @author lgt
 */
public class Ex02 {
    public static void main(String[] args) {
        System.out.println("请输入任意一段字符");
        Scanner s=new Scanner(System.in);
        String phrase=s.nextLine();
        String[] array=phrase.split("");
        HashSet<String> set=new HashSet();
        System.out.println("出现的字符有");
        for (int i = 0; i <array.length ; i++) {
            set.add(array[i]);
        }
        System.out.print(" "+set);

    }
}

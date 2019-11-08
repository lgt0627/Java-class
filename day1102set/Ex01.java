package pangu.com.day1102set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created on 2019/11/3 10:15 上午
 *
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(10);
        Random a=new Random();
        while (set.size()<10){
            int b=a.nextInt(20)+1;
            set.add(b);
        }
        System.out.println(set);





    }


}

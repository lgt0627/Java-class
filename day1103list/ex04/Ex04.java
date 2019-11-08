package pangu.com.day1103list.ex04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/11/3 2:40 下午
 *
 * @author lgt
 */
public class Ex04 {
    public static void main(String[] args) {
      List list=new ArrayList<>();
      list.add(new Student("lgt","春秋",8));
        list.add(new Student("lgt","春秋",6));
        list.add(new Student("lgt","春秋",10));
        for (Object c:list) {
            System.out.println(c);

        }
    }
}

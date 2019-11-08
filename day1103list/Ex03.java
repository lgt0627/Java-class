package pangu.com.day1103list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/11/3 2:29 下午
 *3.把如下元素存入List集合
 * “aaa” “bbb” “aaa” “abc”“xyz” “123” “xyz”
 * 去掉重复元素
 * @author lgt
 */
public class Ex03 {
    public static void main(String[] args) {
        List <String>list=new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size()  ; j++) {
                Object temp = list.get(j);
                if (list.get(i) == list.get(j )) {
                    list.remove(j);

                }
            }
        }
        System.out.println(list);
    }
}

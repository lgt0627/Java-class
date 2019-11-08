package pangu.com.day1101;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created on 2019/11/1 5:03 下午
 *已知某学校的教学课程内容安排如下：
 * 完成下列要求：
 * 1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
 * 课程安排。
 * 2） 增加了一位新老师Allen 教JDBC
 * 3） Lucy 改为教CoreJava
 * 4） 遍历Map，输出所有的老师及老师教授的课程(Set<Map.Entry<String,String>>、Set<String> get(key))
 * 5） 利用Map，输出所有教JSP 的老师。
 * @author lgt
 */
public class Ex03 {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("lgt","JSP");
        map.put("lgt1","maths");
        map.put("lgt2","English");
        map.put("lgtT","JSP");
        map.put("Lucy","Chinese");
        System.out.println(map);
        System.out.println();
        System.out.println("增加了一位新老师Allen 教JDBC");
        map.put("Allen","JDBC");
        System.out.println("Lucy 改为教CoreJava ");
        map.put("Lucy","CoreJava");
        System.out.println(map);
        System.out.println();
         Set set=map.keySet();
        System.out.println("所有老师和他教的课");
        for (Object c:set) {
            System.out.println("老师名："+c+"    "+"课程名:"+map.get(c));
        }
        System.out.println();
        System.out.println("教JSP 的老师的有");
        for (Object v:set) {
            if(map.get(v).equals("JSP"))
            System.out.println(v);

        }


    }
}

package pangu.com.day1103list.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/11/3 2:00 下午
 *编写一个类Book，具有name,price,press,author 然后创建5个对象
 *  放入ArrayList中，并实现按照price大小排序，然后遍历ArrayList输出每个Book对象,
 *  使用toString 方法打印。
 * @author lgt
 */
public class Ex02 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("坤坤最美",100,"陈浩爱坤1") );
        list.add(new Book("坤坤最娘",90,"陈浩爱坤2") );
        list.add(new Book("坤坤最骚",130,"陈浩爱坤3") );
        list.add(new Book("坤坤最tao",110,"陈浩爱坤4") );
        list.add(new Book("坤坤diao",105,"陈浩爱坤5") );
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book temp = (Book)list.get(j);

                if (((Book) list.get(j)).getPrice() > ((Book)list.get(j + 1)).getPrice()) {
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        for (Object c:list) {
            System.out.println(c.toString());

        }
    }
}

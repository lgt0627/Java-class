package pangu.com.day1103list;

import java.util.*;

/**
 * Created on 2019/11/3 1:34 下午
 * x1.分析以下需求，并用代码实现：
 * (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * (2)编写方法对List集合进行排序
 * (2)然后利用迭代器遍历集合元素并输出
 * (3)如：15 18 20 40 46 60 65 70 75 91
 *
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) {
        int count = 10;
        Set<Integer> set = new HashSet<>(count);
        Random a = new Random();
        while (set.size() < count) {
            int b = a.nextInt(100) + 1;
            set.add(b);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Integer temp = list.get(j);
                if (list.get(j) > list.get(j + 1)) {
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        Iterator integer=list.iterator();
        while(integer.hasNext()) {
            System.out.println(integer.next());
        }
    }


}


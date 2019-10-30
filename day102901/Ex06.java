package pangu.com.day102901;

/**
 * Created on 2019/10/29 7:07 下午
 *1.编程. 已知字符串：”this is a test of java”.
 * 按要求执行以下操作：
 * (1) 统计该字符串中字母s出现的次数
 * (2) 取出子字符串”test”
 * (3) 将本字符串复制到一个字符数组Char[] str中.
 * (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
 * (5) 用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)
 * (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台
 * @author lgt
 */
public class Ex06 {
    public static void main(String[] args) {
        String s="this is a test of java";
        char []s1=s.toCharArray();
        int count=0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == 's') {
                count++;
            }
        }
        char []str=s.substring(11,14).toCharArray();
        System.out.println(str);
        String []m=s.split(" ");
        for (int j = 0; j <m.length ; j++) {
            String s2 = m[j].substring(0,1).toUpperCase()+m[j].substring(1);
            System.out.print(s2+" ");

        }
        System.out.println();
        StringBuffer ss=new StringBuffer();
        ss.append(s);
        System.out.println(ss.reverse());
        for (int l = 0; l <m.length ; l++) {
            System.out.println(m[l]);

        }

    }
}

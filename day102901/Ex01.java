package pangu.com.day102901;

import java.util.Scanner;

/**
 * Created on 2019/10/29 6:12 下午
 *
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) {
        System.out.println("给出一个字符串");
        Scanner s2=new Scanner(System.in);
        String s1=s2.nextLine();
        char s[]=s1.toCharArray();
        int count=0;int count1=0;
        for (int i = 0; i <s.length ; i++) {
            if(s[i]>='0'&&s[i]<='9'){
                count++;
            }
            else if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z')){
                count1++;
            }

        }
        System.out.println("数字有"+count+"个");
        System.out.println("字母有"+count1+"个");
    }


}

package pangu.com.day102901;

import java.util.Scanner;

/**
 * Created on 2019/10/29 6:32 下午
 *
 * @author lgt
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("输入一段话");
        String s1=s.nextLine();

        System.out.println(s1
                .replace("恐怖","**")
                .replace("爆炸","**")
                .replace("性","**")
                .replace("枪","**")
                .replace("军火","**")
                .replace("色情","**"));


    }
}

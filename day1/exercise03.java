package pangu.com.day1;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[2];
        name[0] = "liuguotai";
        name[1] = "123456";
        int a = 1;
        int b = 0;
        System.out.println("请输入你的用户名：");
        while (a != 0) {

            String s = sc.next();
            if (s.equals(name[0])) {
                System.out.println("请输入你的密码：");
                auto: while (b!=100){
                    String m = sc.next();
                    if (m.equals(name[1])) {
                        System.out.println("欢迎回来");
                        System.exit(-1);
                    } else {

                        System.out.println("你输入的密码不正确,再来一次");
                        b++;

                        if (b == 3) {
                            System.out.println("三次机会用完，拜拜！");
                            System.exit(0);
                        }
                        continue auto;
                    }
                }
            } else {

                a++;
                if (a == 4) {
                    System.out.println("三次机会用完，拜拜！");
                    break;
                }
                System.out.println("你输入的用户名错误，请重新输入！");

            }

        }

    }
}
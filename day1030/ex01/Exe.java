package pangu.com.day1030.ex01;

import java.util.Random;
import java.util.Scanner;

/**
 * Created on 2019/10/30 5:14 下午
 *
 * @author lgt
 */
public class Exe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("你要随机多少以内的一个数");
        if(input.hasNextInt()){
            int rand=input.nextInt();
            System.out.println("随机5次");
            for (int i = 0; i <5 ; i++) {
                Random random=new Random();
                System.out.println(random.nextInt(rand+1));
            }
        }else {
            System.out.println("不是数字");
            System.exit(0);
        }

    }
}

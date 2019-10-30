package pangu.com.day502.ex04;

import java.util.Scanner;

public class TestCount {
    public static void main(String[] args) {
        Count count=new Count();
//        System.out.println(count.toString());
        System.out.println("查询余额--1，存钱--2，取钱--3，查询开户时间--4");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();

        switch (choice){
            case 1:count.viewmoney();break;
            case 2:
                System.out.println("输入你要存的钱");
                count.save(s.nextDouble());
                break;
            case 3:
                System.out.println("输入你要取的钱");
                count.draw(s.nextDouble());
                break;
            case 4:count.viewdate();
        }


    }
}

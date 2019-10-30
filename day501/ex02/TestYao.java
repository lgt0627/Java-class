package pangu.com.day501.ex02;

import java.util.Scanner;

public class TestYao {
    public static void main(String[] args) {
        System.out.println("请选择狗的前方有什么：1---啥也没有，2---骨头，3---男人，4---女人");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        switch (choice) {
            case 1:Dog.yao();break;
            case 2:Dog.yao1();break;
            case 3:Dog.yao2();break;
            case 4:Dog.yao3();break;
        }
    }
}

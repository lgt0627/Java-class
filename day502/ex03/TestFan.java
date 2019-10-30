package pangu.com.day502.ex03;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        System.out.println("风扇需要开吗？风挡要调到几档");
        Scanner s=new Scanner(System.in);

        Fan fan=new Fan();
        fan.setOn(s.next());
        fan.setSpeed(s.nextInt());
        System.out.println(fan.toString());

    }
}

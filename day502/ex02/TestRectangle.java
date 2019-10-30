package pangu.com.day502.ex02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("给个长和高(整数)");
        Scanner s=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(s.nextInt());
        rectangle.setWidth(s.nextInt());
        System.out.println("周长是"+rectangle.perimeter(rectangle.getLength(),rectangle.getWidth()));
        System.out.println("面积是"+rectangle.area(rectangle.getLength(),rectangle.getWidth()));

    }
}

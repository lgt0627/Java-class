package pangu.com.day501.ex01;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Book book=new Book();
        System.out.println("请给个书名呗");
        book.setTitle(s.next());
        System.out.println("再给个书的页数吧");
        book.setPageNum(s.nextInt());

        System.out.println(book.toString());
    }
}

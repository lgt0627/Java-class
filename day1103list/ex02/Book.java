package pangu.com.day1103list.ex02;

/**
 * Created on 2019/11/3 1:57 下午
 *
 * @author lgt
 */
public class Book {
    private String name;
    private double price;
    private String author;

    public Book() {
    }


    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}


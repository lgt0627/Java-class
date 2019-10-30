package pangu.com.day1028.ex02;

/**
 * @author lgt
 * 1. 编写程序描述兔子和青蛙
 * 需求说明：使用面向对象的思想，设计自定义类描述兔子和青蛙
 */
public abstract class Animal {
    private String name;
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

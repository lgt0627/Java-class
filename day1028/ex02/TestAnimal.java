package pangu.com.day1028.ex02;

/**
 * @author lgt
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        rabbit.setName("兔子");
        System.out.print("这是"+rabbit.getName()+"，");
        rabbit.eat();
        Animal frog=new Frog();
        frog.setName("乌龟");
        System.out.print("这是"+frog.getName()+"，");
        frog.eat();


    }


}

package pangu.com.day102901;

/**
 * Created on 2019/10/29 6:25 下午
 *
 * @author lgt
 */
public class Ex02 {
    public static void main(String[] args) {


        String phrase = "这些年一个人，风也过，雨也过,有过泪,有过错，还记得坚持什么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中";
        int a = (phrase.length() - phrase.replace("过","").length());
        System.out.println("过字出现了"+a+"次");
    }
}

package pangu.com.day102901;

/**
 * Created on 2019/10/29 6:51 下午
 *
 * @author lgt
 */
public class Ex05 {
    public static void main(String[] args) {


        String st1 = "aa,bb,cc";
        String st3 = "aa   bb    cc";
        String st4 = "D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";
        System.out.println(st1.substring(0,st1.indexOf(",")));
        System.out.println(st3.substring(0,st3.indexOf(" ")));
        System.out.println(st4.substring(0,st4.indexOf("\\")));
    }

}

package pangu.com.day102901;

/**
 * Created on 2019/10/29 7:40 下午
 *
 * @author lgt
 */
public class Ex07 {
    public static void main(String[] args) {
        String info="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        String [] newInfo=info.split("\\*");
        for (int i = 0; i < newInfo.length; i++) {
            System.out.println(newInfo[i].replace("#"," "));
        }


    }
}

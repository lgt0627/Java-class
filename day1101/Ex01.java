package pangu.com.day1101;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created on 2019/11/1 4:21 下午
 *
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) {
        String stringBuffer = new String("If you want to change your fate I think you must come to the ujiuye to learn java" );
        String []newString=stringBuffer.split(" ");
        Map<String,Integer> map=new HashMap<String, Integer>();
        for (int i =0; i <newString.length;i++) {
           if(map.get(newString[i])==null){map.put(newString[i],1);}
           if(map.get(newString[i])!=null){map.put(newString[i],map.get(newString[i])+1);}

        }
        Set set=map.keySet();
        for (Object c:set) {
        System.out.println(c+"   出现了"+(map.get(c)-1)+"次");
        }
    }


}

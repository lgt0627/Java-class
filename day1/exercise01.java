package pangu.com.day1;

import org.w3c.dom.ls.LSOutput;

public class exercise01 {
    public static void main(String[] args) {

        int b = 0;
        int max=0;
        int min=10;
        int [] oldArr= {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        for (int a = 0; a < 16; a++) {
              if(oldArr[a]>max)max=oldArr[a];
              if(oldArr[a]<min)min=oldArr[a];
            if (oldArr[a] != 0) {
                b++;
            }

        }
        int[] newArr = new int[b];
        int e = 0;
        System.out.print("int newArr[]={");
        for (int c = 15; c >= 0; c--) {

            if (oldArr[c] != 0) {

                newArr[e] = oldArr[c];
                System.out.print(newArr[e]+",");
                e++;

            }
        }

       System.out.println("}"+"\n"+"最大值是："+max);
        System.out.println("最小值是："+min);
    }
}

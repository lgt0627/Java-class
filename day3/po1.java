package pangu.com.day3;

public class po1 {

    static person array[]=new person[10];
    static int count=0;
    static{
        for (int i = 0; i < 8; i++) {
            array[i]=new person();
            array[i].setAge(21+i);;
            array[i].setName("lgt"+(i+1));
            array[i].setSex("男");
            count++;
        }
    }
}

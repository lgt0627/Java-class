package pangu.com.day204;

public class ex08 {
    public static void main(String[] args) {
        int []array={1,56,78,45,35};
        int max =array[1];int maxnumber=0;
        int min =array[1];int minnumber=0;

        for (int i = 0; i <array.length ; i++) {
            if(array[i]>=max)max=array[i];
            else min=array[i];
        }
        System.out.println("array["+maxnumber+"]="+max+",array["+minnumber+"]="+min);
    }
}

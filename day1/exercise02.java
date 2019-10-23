package pangu.com.day1;

public class exercise02 {
    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 1; i < 5; i++) {
            j = i;
            while (j!=0) {
                System.out.print(k % 10);
                j--;
                k++;
            }
            System.out.println(" ");
        }
        System.out.println("");


    }
}


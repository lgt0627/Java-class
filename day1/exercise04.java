package pangu.com.day1;

public class exercise04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 7 -i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 1; m <= 6; m++) {
            for (int n = 1; n <=m; n++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= 11-2*m; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


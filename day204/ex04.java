package pangu.com.day204;

public class ex04 {
    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4,23, 5, 6,46,98, 0};
        int max = n[0];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

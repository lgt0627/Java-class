package pangu.com.day204;

import javax.imageio.stream.ImageInputStream;

public class ex03 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}

package pangu.com.day1029;

/**
 * Created on 2019/10/29 4:57 下午
 *
 * @author lgt
 */
public class Ex01 {
    public static void main(String[] args) {
        String[][] yuanPan = new String[54][20];
        int pai = 52;
        /*
        初始牌
         */
        for (int i = 0; i < pai; i++) {
            if (i > -1 && i < 13) {
                yuanPan[i][10] = "红桃" + (i + 1);
            }
            if (i > 12 && i < 26) {
                yuanPan[i][10] = "方片" + (i % 13 + 1);
            }
            if (i > 25 && i < 39) {
                yuanPan[i][10] = "黑桃" + (i % 13 + 1);
            }
            if (i > 38 && i < 52) {
                yuanPan[i][10] = "梅花" + (i % 13 + 1);
            }
        }

        yuanPan[52][10] = "大王";
        yuanPan[53][10] = "小王";
        String[][] newPai = new String[54][20];
        int b = 54;
        for (int j = 0; j < newPai.length; j++) {

            int a = (int) (Math.random() * b);
            newPai[j][10] = yuanPan[a][10];
            yuanPan[a][10] = yuanPan[b - 1][10];
            b--;

        }

        //洗牌
        int diZhuPai = (int) Math.random() * 51;
        //选中地主牌
        String[][] nona1 = new String[20][20];
        String[][] nona2 = new String[20][20];
        String[][] nona3 = new String[20][20];
        int faPai = 50;
        int m = 0;
        int n = 0;
        int h = 0;
        //每个玩家发牌的记牌数
        for (int l = 0; l <=faPai; l++) {
            if ((l + 1) % 3 == 1) {
                nona1[m][10]= newPai[l][10];
                m++;
            }
            if ((l + 1) % 3 == 2) {
                nona2[n][10] = newPai[l][10];
                n++;

            }
            if ((l + 1) % 3 == 0) {
                nona3[h][10] = newPai[l][10];
                h++;
            }

        }

        //发牌
        if ((diZhuPai + 1) % 3 == 1) {
            nona1[m ][10] = newPai[51][10];
            nona1[m + 1][10] = newPai[52][10];
            nona1[m + 2][10] = newPai[53][10];
            System.out.println("这是地主牌");
            for (int i = 0; i < nona1.length; i++) {
                System.out.print(nona1[i][10]+" ");
            }
            System.out.println();
            System.out.println("这是农名牌");
            for (int i = 0; i < n; i++) {
                System.out.print(nona2[i][10]+" ");
            }
            System.out.println();
            for (int i = 0; i < h; i++) {
                System.out.print(nona3[i][10]+" ");
            }

        } else if ((diZhuPai + 1) % 3 == 2) {
            nona2[n ][10] = newPai[51][10];
            nona2[n + 1][10] = newPai[52][10];
            nona2[n + 2][10] = newPai[53][10];
            System.out.println("这是地主牌");
            for (int i = 0; i < nona2.length; i++) {
                System.out.print(nona2[i][10]+" ");
            }
            System.out.println();
            System.out.println("这是农名牌");
            for (int i = 0; i < m; i++) {
                System.out.print(nona1[i][10]+" ");
            }
            System.out.println();
            for (int i = 0; i < h; i++) {
                System.out.print(nona3[i][10]+" ");
            }
        } else if ((diZhuPai + 1) % 3 == 0) {
            nona3[h][10] = newPai[51][10];
            nona3[h + 1][10] = newPai[52][10];
            nona3[h + 2][10] = newPai[53][10];
            System.out.println("这是地主牌");
            for (int i = 0; i < nona3.length; i++) {
                System.out.print(nona3[i][10]+" ");
            }
            System.out.println();
            System.out.println("这是农名牌");
            for (int i = 0; i < n; i++) {
                System.out.print(nona2[i][10]+" ");
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                System.out.print(nona1[i][10]+" ");
            }
        }
    }
}

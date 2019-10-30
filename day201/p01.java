package pangu.com.day201;
public class p01 {
    public static void main(String[] args) {
        student  [] student ={};
        student[] s = new student[5];
        s[0]=new student();
        s[1]=new student();
        s[2]=new student();
        s[3]=new student();
        s[4]=new student();
        s[0].set("lgt", 89, "nanjing", "nan");
        s[1].set("ggg", 56, "beijing", "nan");
        s[2].set("ttt", 34, "shanghai", "nv");
        s[3].set("uuu", 48, "changzhou", "nv");
        s[4].set("hhh", 83, "chengdu", "nan");


        student p = new student();//排序
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (s[i].age > s[j].age) {
                    p = s[i];
                    s[i] = s[j];
                    s[j] = p;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println( s[i].name+"," + s[i].age+"," +s[i].adress+","+s[i].sex);
        }//输出
    }
}

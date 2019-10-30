package pangu.com.day203;
import java.util.Scanner;
public class ex05 {
    public  static void main(String[] args){
        int year=0;
        try{
            //定义接收用户输入的对象
            Scanner input=new Scanner(System.in);
            //接收用户输入
            System.out.print("请输入一个年份：");
            year=input.nextInt();
            //判断是否是闰年
            if(year%400==0 || (year%4==0&&year%100!=0))
                System.out.println(year+"是闰年");
            else
                System.out.println(year+"不是闰年");
        }catch(Exception e){
            System.out.println("请输入整数！");
        }
    }
}

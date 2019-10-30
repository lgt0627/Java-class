package pangu.com.day1028.ex01;


interface Inter{void  show();}
    class Outer  {
         public static Inter method(){
             return new Inter() {
                 @Override
                 public void show() {
                     System.out.println("helloWorld");
                 }

            };
        }

    }



/**
 * @author edz
 */
public class OutDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}


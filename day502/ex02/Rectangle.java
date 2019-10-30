package pangu.com.day502.ex02;

public class Rectangle {
    private int length=1;
    private int width=1;
    public void setLength(int length){
        this.length=length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int perimeter(int length,int width){
        return 2*(length+width);
    }
    public int area(int length,int width){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

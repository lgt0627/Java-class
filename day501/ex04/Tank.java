package pangu.com.day501.ex04;

public class Tank {
    private int x;
    private int y;
    private char dir;
    private String Type;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(char dir) {
        this.dir = dir;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDir() {
        return dir;
    }

    public String getType() {
        return Type;
    }


    public String ShowData() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dir=" + dir +
                ", Type='" + Type + '\'' +
                '}';
    }
}

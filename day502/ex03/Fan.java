package pangu.com.day502.ex03;

public class Fan {
    private int speed;
    private String on;
    private int radius=20;

    public Fan() {
    }

    public Fan(int speed, String on, int radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(String on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                "档, on='" + on + '\'' +
                ", radius=" + radius +
                "cm}";
    }
}

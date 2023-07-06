package Fan;

public class Fan {
    private int slow = 1;
    private int medium = 2;
    private int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.on == true){
            return speed + " " + color + " " + radius + " " + "Fan is on";
        }else{
            return color + " " + radius + " " + "Fan is off";
        }
    }
}

package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yello");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

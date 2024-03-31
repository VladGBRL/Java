
public class Robot implements Computer, Mechanism {
    public void boot(Device device) {
        System.out.println("Booting...");
        device.on();
        move();
        device.off();
    }

    public void move() {
        System.out.println("Moving...");
    }

    public static void main(String[] args) {
        Robot myRobot = new Robot();

        myRobot.boot(new Device() {
            @Override
            public void on() {
                System.out.println("Device is ON");
            }

            @Override
            public void off() {
                System.out.println("Device is OFF");
            }
        });
    }
}
package exercises.technology;

public class SmartPhone extends Computer {
    private String ringtone;

    public SmartPhone(String name, String operatingSystem, int memory,
                      String color, boolean on, String ringtone) {
        super(name, operatingSystem, memory, color, on);
        this.ringtone = ringtone;
    }

   @Override
   public String toString() {
        if (on) {
            return getName() + " is a " + getColor() + " " + getOperatingSystem() + ".";
        } else {
            return getName() + " is a " + getColor() + " " + getOperatingSystem() + ", but it's currently off.";
        }
   }

   @Override
    public void turnOff() {
        System.out.println(getName() + " powering off...");
        this.on = false;
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " powered on! Welcome!");
        this.on = true;
    }

    public String ring() {
        if (on) {
            System.out.println("Music playing: " + ringtone);
            return ringtone;
        } else {
            return "Silence...";
        }

    }
}

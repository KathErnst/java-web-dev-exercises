package exercises.technology;

public class Laptop extends Computer{
    private String purpose;

    public Laptop(String name, String operatingSystem, int memory,
                  String color, boolean on, String purpose) {
        super(name, operatingSystem, memory, color, on);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return getName() + " is a " + getColor() + " laptop that runs on " + getOperatingSystem() + " and is primarily " +
                "for " + purpose + " use.";
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


}

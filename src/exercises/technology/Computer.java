package exercises.technology;

public abstract class Computer {

    private String name;
    private String operatingSystem;
    private int memory;
    private String color;
    public boolean on;

    public Computer(String name, String operatingSystem,
                    int memory, String color, boolean on) {
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.color = color;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();

    public void turnOff() {};
    public void turnOn() {};
}

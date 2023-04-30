package exercises.technology;

public class Program {

    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("Katherine's iPhone", "iPhone", 4000,
                "lavender", false, "Somewhere Over the Rainbow");
        SmartPhone phone2 = new SmartPhone("Nathan's iPhone", "iPhone", 3000, "Black", true, "Ocean Avenue");
        Laptop laptop1 = new Laptop("Macbook Air", "Mac", 10000, "Rose Gold", true, "Personal");
        Laptop laptop2 = new Laptop("Boeing laptop", "Windows", 8000, "Black", false, "Work");

        System.out.println(laptop2);
        laptop2.turnOn();
        phone1.ring();
        phone1.turnOn();
        phone1.ring();
        phone2.ring();
        phone2.turnOff();
        phone2.ring();
        System.out.println(phone2);
        System.out.println(laptop1);
    }
}

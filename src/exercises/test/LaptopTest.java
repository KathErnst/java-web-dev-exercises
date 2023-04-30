package exercises.test;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LaptopTest {

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    @Test
    public void testConstructorSetsOS(){
    Laptop test_laptop = new Laptop("Old Laptop", "Windows", 2000, "black", false, "school");
        String spec = "test if new laptop has correct operating system";
        String expected = "Windows";
        String actual = test_laptop.getOperatingSystem();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testConstructorSetsMemory(){
        Laptop test_laptop = new Laptop("Old Laptop", "Windows", 2000, "black", false, "school");
        String spec = "test if new laptop has correct memory";
        int expected = 2000;
        int actual = test_laptop.getMemory();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testConstructorSetsPurpose(){
        Laptop test_laptop = new Laptop("Old Laptop", "Windows", 2000, "black", false, "school");
        String spec = "test if laptop has correct purpose";
        String expected = "school";
        String actual = test_laptop.getPurpose();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testLaptopTurnsOn(){
        Laptop test_laptop = new Laptop("Old Laptop", "Windows", 2000, "black", false, "school");
        test_laptop.turnOn();
        String spec = "test if laptop turns on";
        boolean expected = true;
        boolean actual = test_laptop.on;
        assertEquals(spec, expected, actual);
    }


}

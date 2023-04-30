package exercises.test;

import exercises.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    @Test
    public void testRingWhileOff(){
    SmartPhone test_phone = new SmartPhone("WalkieTalkie", "None", 5, "blue and purple", false, "Old McDonald");
        String spec = "test that phone does not ring when turned off";
        String expected = "Silence...";
        String actual = test_phone.ring();
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testTurnOn(){
        SmartPhone test_phone = new SmartPhone("WalkieTalkie", "None", 5, "blue and purple", false, "Old McDonald");
        test_phone.turnOn();
        String spec = "test that phone is on when turnedOn method is called";
        boolean expected = true;
        boolean actual = test_phone.on;
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testRingWhileOn(){
        SmartPhone test_phone = new SmartPhone("WalkieTalkie", "None", 5, "blue and purple", false, "Old McDonald");
        test_phone.turnOn();
        String spec = "test that phone rings when on";
        String expected = "Old McDonald";
        String actual = test_phone.ring();
        assertEquals(spec, expected, actual);
    }
}

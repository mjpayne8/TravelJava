import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Zsolt", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }

}

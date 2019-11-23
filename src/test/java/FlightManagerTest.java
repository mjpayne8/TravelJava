import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private FlightManager manager;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BUDGIE);
        flight = new Flight(plane, "ZH122", "GLA", "EDI", "12:00");
        passenger1 = new Passenger("Zsolt", 1);
        passenger2 = new Passenger("Louise", 2);
        passenger3 = new Passenger("Harrison", 3);
        manager = new FlightManager(flight);
    }

    @Test
    public void canGetFlight() {
        assertEquals(flight, manager.getFlight());
    }

    @Test
    public void canFindWeightPerPassenger(){
        assertEquals(1.5,manager.reservedWeight(),0.01);
    }

    @Test
    public void canFindWeightBookedOnFlight(){
        assertEquals(0, manager.bookedWeight(), 0.01);
    }

    @Test
    public void canFindRemainingWeight(){
        assertEquals(3, manager.remainingWeight(),0.01);
    }
}

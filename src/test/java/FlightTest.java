import org.junit.Before;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BUDGIE);
        flight = new Flight(plane,"ZH122","GLA","EDI","12:00");
        passenger1 = new Passenger("Zsolt",1);
        passenger2 = new Passenger("Louise", 2);
        passenger3 = new Passenger("Harrison", 3);
    }

}

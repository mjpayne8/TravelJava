import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetDeparturePoint(){
        assertEquals("GLA", flight.getDeparturePoint());
    }

    @Test
    public void canGetArrivalPoint(){
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void canGetNumberOfPassengers(){
        assertEquals(0, flight.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.numberOfPassengers());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(2, flight.availableSeats());
    }

    @Test
    public void knowsIfSeatsAvailable(){
        assertEquals(true, flight.isAvailableSeats());
    }

    @Test
    public void knowsIfSeatsAreNotAvailable(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(false, flight.isAvailableSeats());
    }

    @Test
    public void booksPassengerIfSeatsAvailable(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.numberOfPassengers());
    }

    @Test
    public void willNotBookPassengerIfFlightFull(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(2, flight.numberOfPassengers());
    }

}

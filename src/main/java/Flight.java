import java.util.ArrayList;

public class Flight {

    private final String destination;
    private Plane plane;
    private String code;
    private String departurePoint;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String code, String departurePoint, String destination, String departureTime) {
        this.plane = plane;
        this.code = code;
        this.departurePoint = departurePoint;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getDeparturePoint() {
        return this.departurePoint;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.numberOfPassengers();
    }

    public boolean isAvailableSeats() {
        return this.availableSeats() > 0;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void bookPassenger(Passenger passenger) {
        if (this.isAvailableSeats()){
            this.addPassenger(passenger);
        }
    }
}

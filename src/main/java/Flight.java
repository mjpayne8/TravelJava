import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String code;
    private String departurePoint;
    private String arrivalPoint;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String code, String departurePoint, String arrivalPoint, String departureTime) {
        this.plane = plane;
        this.code = code;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }
}

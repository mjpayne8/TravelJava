public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double reservedWeight() {
        return ((double) this.flight.getPlane().getTotalWeight()/this.flight.getPlane().getCapacity())/2;
    }

    public double bookedWeight() {
        return (this.reservedWeight()*this.getFlight().numberOfPassengers());
    }

    public double remainingWeight() {
        return (this.getFlight().getPlane().getTotalWeight()/2) - this.bookedWeight();
    }
}

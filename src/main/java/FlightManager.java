public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double reservedWeight() {
        return ((double) this.getTotalWeight()/this.getCapacity())/2;
    }

    public double bookedWeight() {
        return (this.reservedWeight()*this.getFlight().numberOfPassengers());
    }

    public double remainingWeight() {
        return (this.getTotalWeight()/2) - this.bookedWeight();
    }

    public int getTotalWeight() {
        return this.getFlight().getPlane().getTotalWeight();
    }

    public int getCapacity() {
        return this.getFlight().getPlane().getCapacity();
    }
}

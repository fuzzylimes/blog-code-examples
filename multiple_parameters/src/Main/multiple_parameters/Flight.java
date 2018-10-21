package multiple_parameters;

public class Flight {

    private int seats = 150, passengers;
    private int totalCheckedBags;
    private int maxCarryOns = seats * 2, totalCarryOns;

    public Flight() {

    }

    public Flight(int seats) {
        this.seats = seats;
    }

    public void add1Passenger() {
        if(seatsAvailable()) {
            this.passengers += 1;
        } else {
            handleTooMany();
        }
    }

    public void add1Passenger(int checkedBags) {
        if(seatsAvailable()) {
            add1Passenger();
            totalCheckedBags += checkedBags;
        }
    }

    public void add1Passenger(int checkedBags, int carryOns) {
        if(seatsAvailable() && hasCarryOnSpace(carryOns)) {
            add1Passenger(checkedBags);
            totalCarryOns += carryOns;
        }
    }

    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    public void addNPassengers(Passenger... passengers) {
        for(Passenger p: passengers) {
            add1Passenger(p.getCheckedBags());
        }
    }

    public void addNPassengers(int carryOns, Passenger... passengers) {
        for(Passenger p: passengers) {
            add1Passenger(p, carryOns);
        }
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return totalCarryOns + carryOns <= maxCarryOns;
    }

    private String handleTooMany() {
        return "Too many people already on the flight!";
    }

    private boolean seatsAvailable() {
        return passengers < seats;
    }

    public int getSeats() {
        return seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    public int getMaxCarryOns() {
        return maxCarryOns;
    }

    public int getTotalCarryOns() {
        return totalCarryOns;
    }
}

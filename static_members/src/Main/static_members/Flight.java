package static_members;

public class Flight {

    private int seats = 150, passengers, flightNumber;
    private int totalCheckedBags;
    private int maxCarryOns = seats * 2, totalCarryOns;
    int testing;
    static int allPassengers;

    public Flight() {

    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void add1Passenger() {
        if (seatsAvailable()) {
            this.passengers += 1;
            allPassengers += 1;
        } else {
            handleTooMany();
        }
    }

    public void add1Passenger(int checkedBags) {
        if (seatsAvailable()) {
            add1Passenger();
            totalCheckedBags += checkedBags;
        }
    }

    public void add1Passenger(int checkedBags, int carryOns) {
        if (seatsAvailable() && hasCarryOnSpace(carryOns)) {
            add1Passenger(checkedBags);
            totalCarryOns += carryOns;
        }
    }

    public static int getAllPassengers() {
        return allPassengers;
    }

    public static void clearAllPassengers() {
        allPassengers = 0;
    }

    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
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

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
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

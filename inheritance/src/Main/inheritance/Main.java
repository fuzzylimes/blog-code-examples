package inheritance;

public class Main {

    public static void main(String[] args) {

        Passenger bob = new Passenger(2, 4);

        Flight f1 = new Flight();
        Flight f2 = new Flight(300);
        f1.add1Passenger();
    }
}

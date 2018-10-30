import org.junit.Assert;
import org.junit.Test;
import static_members.Flight;
import static_members.Passenger;

public class FlightTest {

    @Test
    public void add1PassengerTest() {
        Flight f1 = new Flight();
        f1.add1Passenger();
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(0, f1.getTotalCheckedBags());
        Assert.assertEquals(1, Flight.getAllPassengers());
    }

    @Test
    public void add1PassengerCheckedBagTest() {
        Flight f1 = new Flight();
        f1.add1Passenger(3);
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(3, f1.getTotalCheckedBags());
    }

    @Test
    public void add1Passenger2PassengersTest() {
        Flight f1 = new Flight();
        f1.add1Passenger(2);
        f1.add1Passenger();
        Assert.assertEquals(2, f1.getPassengers());
        Assert.assertEquals(300, f1.getMaxCarryOns());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(2, f1.getTotalCheckedBags());
    }

    @Test
    public void add1PassengerBagsTest() {
        Flight f1 = new Flight();
        f1.add1Passenger(3, 2);
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(2, f1.getTotalCarryOns());
        Assert.assertEquals(3, f1.getTotalCheckedBags());
    }

    @Test
    public void add1PassengerBagTest() {
        Flight f1 = new Flight();
        Passenger bob = new Passenger(2, 4);
        f1.add1Passenger(bob);
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(4, f1.getTotalCheckedBags());
    }

    @Test
    public void add1PassengerBothBagTest() {
        Flight f1 = new Flight();
        Passenger bob = new Passenger(2, 4);
        f1.add1Passenger(bob, 2);
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(2, f1.getTotalCarryOns());
        Assert.assertEquals(4, f1.getTotalCheckedBags());
    }

}
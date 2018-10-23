import org.junit.Assert;
import org.junit.Test;
import inheritance.Flight;
import inheritance.Passenger;

public class FlightTest {

    @Test
    public void add1PassengerTest() {
        Flight f1 = new Flight();
        f1.add1Passenger();
        Assert.assertEquals(1, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(0, f1.getTotalCheckedBags());
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

    @Test
    public void add2Passengers() {
        Flight f1 = new Flight();
        Passenger bob = new Passenger(2, 4);
        Passenger jane = new Passenger(0, 1);
        f1.addNPassengers(bob, jane);
        Assert.assertEquals(2, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(5, f1.getTotalCheckedBags());
    }

    @Test
    public void add2PassengersArray() {
        Flight f1 = new Flight();
        Passenger bob = new Passenger(2, 4);
        Passenger jane = new Passenger(0, 1);
        f1.addNPassengers(new Passenger[] {bob, jane});
        Assert.assertEquals(2, f1.getPassengers());
        Assert.assertEquals(0, f1.getTotalCarryOns());
        Assert.assertEquals(5, f1.getTotalCheckedBags());
    }

    @Test
    public void add2PassengersWithBags() {
        Flight f1 = new Flight();
        Passenger bob = new Passenger(2, 4);
        Passenger jane = new Passenger(0, 1);
        Passenger jill = new Passenger(0, 2);
        f1.addNPassengers(2, bob, jane, jill);
        Assert.assertEquals(3, f1.getPassengers());
        Assert.assertEquals(6, f1.getTotalCarryOns());
        Assert.assertEquals(7, f1.getTotalCheckedBags());
    }

}
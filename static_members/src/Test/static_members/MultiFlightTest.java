package static_members;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiFlightTest {

    @Test
    public void multiFlightPassengers() {
        Flight f1 = new Flight();
        f1.add1Passenger();
        f1.add1Passenger();

        Assert.assertEquals(2, Flight.getAllPassengers());

        Flight f2 = new Flight();
        f2.add1Passenger();
        f2.add1Passenger();

        Assert.assertEquals(4, Flight.getAllPassengers());

        Flight.clearAllPassengers();

        Assert.assertEquals(0, Flight.getAllPassengers());

    }

    @Test
    public void multiFlightPassengersImplicit() {
        Flight f1 = new Flight();
        f1.add1Passenger();

        Assert.assertEquals(1, Flight.allPassengers);

        Flight f2 = new Flight();
        f2.add1Passenger();

        Assert.assertEquals(2, Flight.allPassengers);

    }

    @Test
    public void noFlightExists() {
        Assert.assertEquals(0, Flight.getAllPassengers());
        Flight.clearAllPassengers();
        Assert.assertEquals(0, Flight.getAllPassengers());
    }

}
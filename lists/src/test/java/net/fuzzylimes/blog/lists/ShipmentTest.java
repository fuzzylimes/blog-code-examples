package net.fuzzylimes.blog.lists;

import org.junit.Assert;
import org.junit.Test;

import static net.fuzzylimes.blog.lists.ProductFixtures.*;
import static org.hamcrest.Matchers.contains;

public class ShipmentTest {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() {
        shipment.add(table);
        shipment.add(chair);

        Assert.assertThat(shipment, contains(table, chair));
    }

    @Test
    public void shouldReplaceItems() {
        shipment.add(table);
        shipment.add(chair);

        shipment.replace(chair, lamp);

        Assert.assertThat(shipment, contains(table, lamp));
    }

    @Test
    public void shouldNotReplaceMissingItems() {
        shipment.add(lamp);

        shipment.replace(chair, table);

        Assert.assertEquals(1, shipment.getProducts().size());
        Assert.assertThat(shipment, contains(lamp));
    }

    @Test
    public void ShouldIdentifyVanRequirements() {
        shipment.add(table);
        shipment.add(chair);
        shipment.add(lamp);

        shipment.prepare();

        Assert.assertThat(shipment.getLightVanProducts(), contains(lamp, chair));
        Assert.assertThat(shipment.getHeavyVanProducts(), contains(table));
    }
}

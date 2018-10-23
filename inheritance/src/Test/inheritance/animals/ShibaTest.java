package inheritance.animals;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ShibaTest {
    @Test
    public void shibaClassTest() {
        Shiba inu = new Shiba();
        assertThat(inu, instanceOf(Animal.class));
        assertThat(inu, instanceOf(Dog.class));
        assertThat(inu, instanceOf(Shiba.class));
        Assert.assertNotNull(inu.getBreed());
        Assert.assertEquals(4, inu.getLegs());
        Assert.assertEquals("K9", inu.getSpecies());
        Assert.assertEquals("The Shiba-Inu goes REEEEEE!", inu.makeSound());
        Assert.assertEquals("The K9 goes Woof!", inu.originalSound());
    }

    @Test
    public void equalsTest() {
        Dog a = new Dog();
        Dog b = new Dog();
        Assert.assertFalse(a.equals(b));

        b = a;
        Assert.assertTrue(a.equals(b));
    }
}
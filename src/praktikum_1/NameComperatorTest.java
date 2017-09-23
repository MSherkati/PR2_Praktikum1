package praktikum_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameComperatorTest
{

    @Test
    public void testcompare()
    {

        Customer c1 = new Customer("Mo", "Arsch");
        Customer c2 = new Customer("", "Barsch");
        Customer c3 = new Customer("", "Arsch");

        NameComperator comp = new NameComperator();

        // // Beide gleich
        // assertEquals(-1, comp.compare(c1, c2));
        //
        // assertEquals(1, comp.compare(c2, c1));
        // assertEquals(1, comp.compare(c3, c2));

    }

}

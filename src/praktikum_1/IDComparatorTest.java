package praktikum_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class IDComparatorTest
{

    WebShop webshop = new WebShop();

    @Test
    public void testcompare()
    {

        Customer cust1 = new Customer("Jogi", "Löw");
        Customer cust2 = new Customer("Tui", "Löw");

        IDComparator idcomp = new IDComparator();
        

        assertEquals(-1, idcomp.compare(cust1, cust2));

        assertEquals(1, idcomp.compare(cust2, cust1));
        
        

    }

}

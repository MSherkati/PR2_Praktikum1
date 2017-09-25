package praktikum_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WebShop
{
    ArrayList<Customer> _customer;

    public WebShop()
    {
        _customer = new ArrayList<Customer>();
    }

    /**
     * 
     * @param vorname
     * @param nachname
     */
    public void addCustomer(String vorname, String nachname)
    {
        Customer customer = new Customer(vorname, nachname);
        _customer.add(customer);
    }

    /**
     * 
     * @param vorname
     * @param nachname
     */
    public void removeCustomer(String vorname, String nachname)
    {
        Iterator<Customer> iter = _customer.iterator();
        while (iter.hasNext())
        {
            Customer customer = (Customer) iter.next();
            if (customer.get_vorname() == vorname
                    && customer.get_nachname() == nachname)
            {
                iter.remove();
            }
        }

    }

    public void printListOfCustomers(SortingCriterion sort_criterium)
    {
        if (sort_criterium == SortingCriterion.SORT_BY_ID)
        {
            Comparator<Customer> comp = new IDComparator();
            Collections.sort(_customer, comp);

            Iterator<Customer> iter = _customer.iterator();
            while (iter.hasNext())
            {
                Customer cust = (Customer) iter.next();
                System.out.println("Firstname: " + cust.get_vorname()
                        + " Lastname: " + cust.get_nachname() + " ID: "
                        + cust.get_ID());
                // System.out.println(_customer);
                // System.out.println();
            }
        }
        else
        {
            Comparator<Customer> comp = new NameComperator();
            Collections.sort(_customer, comp);

            Iterator<Customer> iter = _customer.iterator();
            while (iter.hasNext())
            {
                Customer cust = (Customer) iter.next();
                System.out.println("Firstname: " + cust.get_vorname()
                        + " Lastname: " + cust.get_nachname() + " ID: "
                        + cust.get_ID());

            }

            // System.out.println(_customer);
        }
    }

}

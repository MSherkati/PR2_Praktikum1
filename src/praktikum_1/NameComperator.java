package praktikum_1;

import java.util.Comparator;

public class NameComperator implements Comparator<Customer>
{

    @Override
    public int compare(Customer o1, Customer o2)
    {
        int result = o1.get_nachname().compareTo(o2.get_nachname());

        if (result == 0)
        {
            result = o1.get_vorname().compareTo(o2.get_vorname());
        }

        return result;
    }

}

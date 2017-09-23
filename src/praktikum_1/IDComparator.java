package praktikum_1;

import java.util.Comparator;

public class IDComparator implements Comparator<Customer>
{
    @Override
    public int compare(Customer o1, Customer o2)
    {
        int result = 1;

        if (o1.get_ID() < o2.get_ID())
        {
            result = -1;
        }

        return result;

    }

}

package jenke;

import java.util.Comparator;

public class TwoNumbersComparator implements Comparator<TwoNumbers>
{

    @Override
    public int compare(TwoNumbers n1, TwoNumbers n2)
    {
        int result = 1;

        if (n1.getNumber1() == n2.getNumber1())
        {
            if (n1.getNumber2() == n2.getNumber2())
            {
                result = 0;
            }
            else if (n1.getNumber2() > n2.getNumber2())
            {
                result = 1;
            }
            else if (n1.getNumber2() < n2.getNumber2())
            {
                result = -1;
            }
        }
        else
        {
            if (n1.getNumber1() < n2.getNumber1())
            {
                result = -1;
            }
        }
        return result;

    }

}

package jenke;

public class Main
{

    public static void main(String[] args)
    {
        TwoNumbers ob1 = new TwoNumbers(4, 5);
        TwoNumbers ob2 = new TwoNumbers(4, 7);
        TwoNumbersComparator comp = new TwoNumbersComparator();

        System.out.println(comp.compare(ob1, ob2));
    }

}

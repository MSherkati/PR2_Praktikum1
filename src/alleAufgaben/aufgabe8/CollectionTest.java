package alleAufgaben.aufgabe8;

import java.util.Collection;
import java.util.Stack;

public class CollectionTest
{

    public static void m(Collection<String> c1, Collection<String> c2)
    {
        for (String a : c1)
        {
            System.out.println(a);
        }

        for (String a : c2)
        {
            System.out.println(a);
        }

        if (c2 instanceof Stack && c2.size() > 0)  // oder !c2.isEmpty()
        {
            System.out.println(((Stack<String>) c2).peek());
        }

    }

    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
        stack.add("HALLO");

        CollectionTest.m(stack, null);
        
        // ToDo ....

    }

}

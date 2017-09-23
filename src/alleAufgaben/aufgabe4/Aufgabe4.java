package alleAufgaben.aufgabe4;

public class Aufgabe4
{
    public static boolean enthaeltZifferIterativ(String s)
    {
        boolean result = false;

        while (s.length() != 0 && !result)
        {
            if (Character.isDigit(s.charAt(0)))
            {
                result = true;
            }
            s = s.substring(1);
        }
        return result;
    }
    // {
    // boolean result = false;
    //
    // if (s.length() == 0)
    // result = false;
    //
    // else
    // for (int i = 0; i < s.length(); ++i)
    // if (Character.isDigit(s.charAt(i)))
    // result = true;
    //
    // return result;
    // }

    public static boolean enthaeltZifferRekursiv(String s)
    {
        boolean result = false;

        if (s.length() == 0)
        {
            result = false;
        }

        else
        {
            String newString = s.substring(1);
            result = Character.isDigit(s.charAt(0))
                    || enthaeltZifferRekursiv(newString);
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(Aufgabe4.enthaeltZifferIterativ("Hallo"));
        System.out.println(Aufgabe4.enthaeltZifferIterativ("Ha4llo"));
        System.out.println(Aufgabe4.enthaeltZifferIterativ(""));
        System.out.println(Aufgabe4.enthaeltZifferIterativ("5"));

        System.out.println("_______________________________");

        System.out.println(Aufgabe4.enthaeltZifferRekursiv("Hallo"));
        System.out.println(Aufgabe4.enthaeltZifferRekursiv("Ha4llo"));
        System.out.println(Aufgabe4.enthaeltZifferRekursiv(""));
        System.out.println(Aufgabe4.enthaeltZifferRekursiv("5"));

    }

}

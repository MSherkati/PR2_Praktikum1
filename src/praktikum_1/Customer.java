package praktikum_1;

public class Customer
{
    private String _vorname;
    private String _nachname;
    private final int _id;
    private static int _zaehler = 0;

    public Customer(String vorname, String nachname)
    {
        _vorname = vorname;
        _nachname = nachname;
        _id = _zaehler;
        _zaehler++;

    }

    public String get_vorname()
    {
        return _vorname;
    }

    public String get_nachname()
    {
        return _nachname;
    }

    public int get_ID()
    {
        return _id;
    }

    @Override
    public String toString()
    {
        String result = "";
        result = "\nFirstname: " + _vorname + " Lastname: " + _nachname
                + " ID: " + _id;
        return result;
    }

}

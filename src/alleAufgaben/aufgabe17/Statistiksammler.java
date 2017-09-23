package alleAufgaben.aufgabe17;

public class Statistiksammler implements Observer
{
    private static int _verkaufteTickets;

    public Statistiksammler(Fahrkartenautomat f)
    {
        _verkaufteTickets = 0;
    }

    @Override
    public void reactOnChange()
    {
        ++_verkaufteTickets;

    }

}

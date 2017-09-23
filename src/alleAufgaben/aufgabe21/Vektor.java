package alleAufgaben.aufgabe21;

public final class Vektor
{
    private final int[] _werte;

    private Vektor(int[] werte)
    {
        _werte = werte;
    }

    // public static Vektor get(int[] werte)
    // {
    // return new Vektor();
    // }

    public int wertAnPosition(int position)
    {
        return _werte[position];
    }

    public int vektorlaenge()
    {
        return _werte.length;
    }

    public Vektor addiere(Vektor v)
    {
        int[] ergebnis = new int[_werte.length];

        for (int i = 0; i < _werte.length; ++i)
        {
            ergebnis[i] = _werte[i] + v._werte[i];
        }
        return new Vektor(ergebnis);
    }
}

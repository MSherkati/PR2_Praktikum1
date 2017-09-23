package alleAufgaben.aufgabe20;

public final class Uhrzeit
{
    private final int _stunde;
    private final int _minute;

    /**
     * @require isValid(rep)
     */
    public static Uhrzeit get(String rep)
    {
        return new Uhrzeit(3, 4);
    }

    /**
     * Gültig sind Uhrzeiten im 24h-Format "hh:mm"
     */
    public boolean isValid(String rep)
    {
        return true;
    }

    private Uhrzeit(int stunde, int minute)
    {
        _stunde = stunde;
        _minute = minute;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean ergebnis = false;

        if (o instanceof Uhrzeit)
        {
            Uhrzeit thisUhrzeit = (Uhrzeit) o;

            if (_stunde == thisUhrzeit._stunde
                    && _minute == thisUhrzeit._minute)
            {
                ergebnis = true;
            }

        }
        return ergebnis;

    }

}

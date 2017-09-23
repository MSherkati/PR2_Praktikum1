package ereignisseZahlen;

/**
 * Die Klasse Ereigniszaehler definiert Materialien, die spezifische Ereignisse
 * z�hlen.
 * 
 * @author Axel Schmolitzky
 * @version 2015-05
 */
class Ereigniszaehler
{
    private String _ereignisart;
    private String _erzeugtAm;
    private int _zaehler;

    /**
     * Ein neuer Ereigniszaehler wird initialisiert mit der Information, was
     * gezaeht werden soll.
     * 
     * @param ereignisart
     *            textuelle Beschreibung der Art des Ereignisses, das gezaehlt
     *            werden soll.
     */
    public Ereigniszaehler(String ereignisart)
    {
        java.text.DateFormat df = new java.text.SimpleDateFormat();
        _erzeugtAm = df.format(java.util.Calendar.getInstance().getTime());
        _ereignisart = ereignisart;
        _zaehler = 0;
    }

    /**
     * Beschreibung der Ereignisart, die dieser Z�hler z�hlt.
     * 
     * @return Beschreibung der Ereignisart, die dieser Z�hler z�hlt.
     */
    public String getEreignisart()
    {
        return _ereignisart;
    }

    /**
     * Der Erzeugungszeitpunkt dieses Z�hlers als String.
     * 
     * @return den Erzeugungszeitpunkt dieses Z�hlers als String.
     */
    public String getErzeugungszeitpunkt()
    {
        return _erzeugtAm;
    }

    /**
     * Registriere ein Ereignis f�r die zu z�hlende Ereignisart.
     */
    public void registriereEreignis()
    {
        _zaehler++;
    }

    /**
     * Der aktuelle Z�hlerstand dieses Z�hlers.
     * 
     * @return den aktuellen Z�hlerstand.
     */
    public int getZaehlerstand()
    {
        return _zaehler;
    }
}

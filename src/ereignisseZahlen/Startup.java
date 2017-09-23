package ereignisseZahlen;
/**
 * Beschreibe hier die Klasse Startup.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class Startup
{
    public static void main(String[] args)
    {
        Ereigniszaehler zaehler = new Ereigniszaehler("Norris rettet Welt");
        Zaehlwerkzeug wz = new Zaehlwerkzeug(zaehler);
    }
}

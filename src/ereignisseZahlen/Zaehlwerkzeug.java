package ereignisseZahlen;
import java.awt.*;
import java.awt.event.*;
/**
 * Beschreibe hier die Klasse Zaehlwerkzeug.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class Zaehlwerkzeug
{
    //Material Ereigniszaehler 
    private Ereigniszaehler _zaehler;
    // Die GUI Klasse
    private ZaehlwerkzeugUI _ui;
    
    /**
     * Konstruktor erhält ein Material Ereigniszaehler
     * @param zaehler
     */
    public Zaehlwerkzeug(Ereigniszaehler zaehler)
    {
        _zaehler = zaehler; 
        _ui = new ZaehlwerkzeugUI(_zaehler.getEreignisart(),
                                  _zaehler.getErzeugungszeitpunkt());
        registriereListener();                        
    }
    
    private void registriereListener()
    {
        _ui.getButton().addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                _zaehler.registriereEreignis();
                aktualisiereUI();
            }
        });
    }
    
    private void aktualisiereUI()
    {
        _ui.getZaehlLabel().setText(""+_zaehler.getZaehlerstand());
    }
}





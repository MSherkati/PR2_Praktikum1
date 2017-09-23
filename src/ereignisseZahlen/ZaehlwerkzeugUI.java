package ereignisseZahlen;

import javax.swing.*;
import java.awt.*;

/**
 * Beschreibe hier die Klasse ZaehlwerkzeugUI.
 * 
 * @author (Dein Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
class ZaehlwerkzeugUI
{
    private JFrame _frame;
    private JLabel _zeitLabel;
    private JButton _button;
    private JLabel _zaehlLabel;

    public ZaehlwerkzeugUI(String titel, String info)
    {
        _frame = new JFrame(titel);
        Container contentPane = new JPanel();
        _frame.setContentPane(contentPane);

        _zeitLabel = new JLabel(info);
        contentPane.add(_zeitLabel);

        _button = new JButton("Registrieren");
        contentPane.add(_button);

        _zaehlLabel = new JLabel("" + 0);
        contentPane.add(_zaehlLabel);

//        _frame.setSize(350, 100);
        _frame.pack();
        _frame.setResizable(false);
        _frame.setVisible(true);

    }

    public JButton getButton()
    {
        return _button;
    }

    public JLabel getZaehlLabel()
    {
        return _zaehlLabel;
    }
}

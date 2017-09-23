package alleAufgaben.aufgabe19;

import java.util.*;

public class Werkzeug
{
    private List<Werkzeug> _subwerkzeuge;
    private String _name;

    public Werkzeug(String name)
    {
        _name = name;
        _subwerkzeuge = new ArrayList<Werkzeug>();
    }

    public void addSubwerkzeuge(Werkzeug subwerkzeug)
    {
        _subwerkzeuge.add(subwerkzeug);
    }

    public Set<String> namenAllerSubwerkzeuge()
    {
        Set<String> ergebnis = new HashSet<String>();
        ergebnis.add(_name);

        if (_subwerkzeuge.size() == 0)
        {
            return ergebnis;
        }

        else
        {
            for (Werkzeug w : _subwerkzeuge)
            {
//                ergebnis.add(w._name);
                ergebnis.addAll(w.namenAllerSubwerkzeuge()); // ERKLÄRUNG BJÖRN
            }
        }

        return ergebnis;
    }
}

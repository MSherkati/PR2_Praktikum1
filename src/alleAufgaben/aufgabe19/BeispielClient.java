package alleAufgaben.aufgabe19;

public class BeispielClient
{

    public static void main(String[] args)
    {

        Werkzeug hauptw = new Werkzeug("HAUPT");
        Werkzeug w1 = new Werkzeug("SUB1");
        Werkzeug w2 = new Werkzeug("SUB2");
        Werkzeug w3 = new Werkzeug("SUB3");

        hauptw.addSubwerkzeuge(w1);
        hauptw.addSubwerkzeuge(w2);
        w1.addSubwerkzeuge(w3);

        System.out.println(hauptw.namenAllerSubwerkzeuge());

    }

}

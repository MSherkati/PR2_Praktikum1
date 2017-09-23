package alleAufgaben.aufgabe17;

public class Fahrkartenautomat extends Observable
{
    public void verkaufeFahrkarte()
    {
        druckeFahrkarte();

         notifyObservers();

    }

    private void druckeFahrkarte()
    {
        // TODO Auto-generated method stub

    }

}

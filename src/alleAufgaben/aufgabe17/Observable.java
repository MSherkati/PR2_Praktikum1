package alleAufgaben.aufgabe17;

import java.util.Set;

abstract class Observable
{

    private Set<Observer> _observers;

    protected Observable()
    {

    }

    public void addObserver(Observer o)
    {

    }

    protected void notifyObservers()
    {
        for (Observer o : _observers)
        {
            o.reactOnChange();
        }
    }
}

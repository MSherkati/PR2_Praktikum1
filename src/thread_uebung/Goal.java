package thread_uebung;

public class Goal
{
    protected int _zaehler = 0;

    public synchronized void score()
    {

        try
        {
        _zaehler++;
         Thread.sleep(100);
         }
         catch (InterruptedException e)
         {
         e.printStackTrace();
         }

    }

    public int get_zaehler()
    {
        return _zaehler;
    }

}

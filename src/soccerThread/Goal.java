package soccerThread;

//import java.util.concurrent.Semaphore;

public class Goal
{
    private int _zaehler = 0;
    // private Semaphore _mutex = new Semaphore(1);

    public void score()
    {
        try
        {
            synchronized (this)
            {
                // _mutex.acquire();
                ++_zaehler;
                // _mutex.release();
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    public int getZaehler()
    {
        return _zaehler;
    }

}

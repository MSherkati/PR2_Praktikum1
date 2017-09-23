package thread_uebung;

public class Main
{

    public static void main(String[] args)
    {
        SoccerPlayer[] soccerarray = new SoccerPlayer[10];
        Goal goal = new Goal();

        for (int i = 0; i <= 9; i++)
        {
            soccerarray[i] = new SoccerPlayer(goal);
            soccerarray[i].start();
        }
        System.err.println("Alle Threads gestartet...");

        for (int i = 0; i <= 9; i++)
        {
            try
            {
                soccerarray[i].join();
                // System.err.println("Wie oft wird gejoint?");
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(goal.get_zaehler());

        // for (int i = 0; i <= 9; i++)
        // {
        // try
        // {
        // soccerarray[i].join();
        // }
        // catch (InterruptedException e)
        // {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }
        //
        // System.out.println(goal.get_zaehler());

    }

}

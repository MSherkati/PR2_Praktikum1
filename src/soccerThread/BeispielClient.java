package soccerThread;

public class BeispielClient
{

    public static void main(String[] args)
    {
        Goal goal = new Goal();
        SoccerPlayer[] players = new SoccerPlayer[10];
        for (int i = 0; i < 10; ++i)
        {
            players[i] = new SoccerPlayer(goal);
        }
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; ++i)
        {
            threads[i] = new Thread(players[i]);
        }
        for (int i = 0; i < 10; ++i)
        {
            threads[i].start();
        }
        System.err.print("Alle Threads gestartet...");

        for (int i = 0; i < 10; ++i)
        {
            try
            {
                threads[i].join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.err.println("fertig!");
        System.err.println(goal.getZaehler());

    }

    // public static void main(String[] args) throws InterruptedException
    // {
    // Goal goal = new Goal();
    // Runnable player1 = new SoccerPlayer(goal);
    // Runnable player2 = new SoccerPlayer(goal);
    // Runnable player3 = new SoccerPlayer(goal);
    // Runnable player4 = new SoccerPlayer(goal);
    // Runnable player5 = new SoccerPlayer(goal);
    // Runnable player6 = new SoccerPlayer(goal);
    // Runnable player7 = new SoccerPlayer(goal);
    // Runnable player8 = new SoccerPlayer(goal);
    // Runnable player9 = new SoccerPlayer(goal);
    // Runnable player10 = new SoccerPlayer(goal);
    //
    // for (int i = 0; i < 10; i++)
    // {
    // Thread thread = new Thread(player1);
    // thread.start();
    // thread.join();
    // }
    //
    // System.out.println(goal.getZaehler());
    //
    // }

}

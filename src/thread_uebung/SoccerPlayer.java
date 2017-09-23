package thread_uebung;

public class SoccerPlayer extends Thread
{
    private Goal _goalkeeper;

    public SoccerPlayer(Goal goal)
    {
        _goalkeeper = goal;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {

            _goalkeeper.score();

        }

    }

}

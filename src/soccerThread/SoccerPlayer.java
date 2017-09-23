package soccerThread;

public class SoccerPlayer implements Runnable
{

    private Goal _goal;

    public SoccerPlayer(Goal goal)
    {

        _goal = goal;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            _goal.score();
        }

    }

}

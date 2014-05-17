package sudoku;

/*
Class Description: Representation of the Sudoku Game Timer.
*/
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Janghun Yu
 */
public class Time
{
    public void display1()
    {
        Timer l_timer = new Timer();
        job j = new job();
        l_timer.schedule(j, 1, 5000);
    }
      

   }

    class job extends TimerTask
    {
        @Override
        public void run()
        {
            System.out.println("Game Over");
        }
    }
   


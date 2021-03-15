import java.util.Arrays;
/**
 * Support class
 *
 * @author Simon Lee
 * @version 11/03/2021
 */
public class Draw
{
    // instance variables
    private int ball = 0, currentBall = 0;
    private final int MAXIMUM = 6, REFRESHER = 0;
    int[] balls = new int[MAXIMUM];
    
    /**
     * Randomly picks a lotto ball
     */
    public void ball() {
        // instance variables
        final int ADDER = 1, MULTIPLE = 40;
        
        // generate the numbers 
        ball = (int)(Math.random() * MULTIPLE) + ADDER;
    }
    
    /**
     * Returns the number on the ball
     */
    public int getBall() {
        // get the ball number and return it
        ball();
        return ball;
    }
    
    /**
     * Draws an array of balls
     */
    public void draw() {
        // refresh array
        for (int b = 0; b < balls.length; b++) {
            balls[b] = REFRESHER;
        }
        
        // generate 6 balls and store them in an array
        for (int i = 0; i < balls.length; i++) {
            // get the ball
            currentBall = getBall();
            
            // run checker
            checker();
            
            // add the ball to array
            balls[i] = currentBall;
            
        }

        // sort array
        sorter();
        
    }

    /**
     * Checks to see if there are duplicate balls in the list
     * 
     * @param balls - the array of lotto balls
     */
    public void checker() {
        // check if ball is already in the list
        for (int i = 0; i < balls.length; i++) {
            while (currentBall == balls[i]) {
                currentBall = getBall();
            }
        }
    }
    
    /**
     * Sorts the array lowest to highest
     */
    public void sorter() {
        // sort array
        Arrays.sort(balls);
    }
    
    /**
     * Return the draw
     * 
     * @param length
     */
    public int[] getDraw() {
        draw();
        return balls;
    }
}




/**
 * Simulates the strike game
 *
 * @author Simon Lee
 * @version 16/03/2021
 */
public class Strike
{
    public static void main(String[] args) {
        // instance variables
        final int STRIKELENGTH = 4;
        final int STRIKETHREE = 3;
        final int STRIKETWO = 2;
        final int STRIKEONE = 1;
        int sameNumbers = 0;
        
        // create new draws
        Draw draw1 = new Draw();
        Draw draw2 = new Draw();
        
        // create array of winning numbers
        int[] winningNumbers = draw1.getDraw();
        
        // create array of users numbers
        int[] userNumbers = draw2.getDraw();
        
        // compare the first 4 numbers of the arrays
        for (int i = 0; i < STRIKELENGTH; i++) {
            // if the numbers are the same add one to winningTotal
            if (winningNumbers[i] == userNumbers[i]) {
                sameNumbers++;
            }
        }
        
        // print out winning numbers and user numbers
        System.out.println("Winning numbers:");
        for (int a = 0; a < STRIKELENGTH; a++) {
            System.out.print(winningNumbers[a] + " ");
        }
        
        System.out.println("");
        System.out.println("Your numbers:");
        for (int b = 0; b < STRIKELENGTH; b++) {
            System.out.print(userNumbers[b] + " ");
        }
        
        // print results
        System.out.println("");
        if (sameNumbers == STRIKELENGTH) {
            System.out.println("You won Strike 4!");
        }
        else if (sameNumbers == STRIKETHREE) {
           System.out.println("You won Strike 3!");
        }
        else if (sameNumbers == STRIKETWO) {
           System.out.println("You won Strike 2!");
        }
        else if (sameNumbers == STRIKEONE) {
           System.out.println("You won Strike 1!");
        }
        else {
           System.out.println("You didn't win anything...");
        }
    }
}

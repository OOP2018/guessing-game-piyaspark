import java.util.Scanner;

/**
 *  Play guessing game on the console.
 *  @author Piyaphol Wiengperm.
 */
public class GameConsole {

    /** play the game. */
    public int play(NumberGame game) {
        Scanner console = new Scanner(System.in);

        // describe the game
        System.out.println( game.toString() );

        // This is just an example.
        System.out.println( game.getMessage() );
        int guess;
        while(true) {
            System.out.print("Your answer? ");
            guess = console.nextInt();
            boolean correct = game.guess(guess);
            System.out.println(game.getMessage());
            if(correct == true)break;
            if(correct == false)continue;
        }
        return guess;
    }

}
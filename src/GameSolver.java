/**
 * The class that automatically solve the guessing game.
 *
 * @author Piyaphol Wiengperm.
 */
public class GameSolver extends NumberGame{
    /**
     * the process of guessing number.
     * @param game is the NumberGame to solve.
     * @return guess number.
     */
    public int play(NumberGame game) {

        System.out.println( game.toString() );
        System.out.println( game.getMessage() );

        int guess = game.getUpperBound();

        while(true){
            boolean correct = game.guess(guess);
            if(correct == true)break;
            if(correct == false){
                if(game.getMessage().contains("too small."))guess += 3;
                if(game.getMessage().contains("too large."))guess -= 5;
                continue;
            }
            }
            return guess;
        }
    }



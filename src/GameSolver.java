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

        int guess = game.getUpperBound()/2;
        int floor = 1;int ceil = game.getUpperBound();

        while(true){
            boolean correct = game.guess(guess);
            if(correct == true)break;
            if(correct == false){
                if(game.getMessage().contains("small."))floor = guess;
                if(game.getMessage().contains("large."))ceil = guess;
                guess = (ceil-floor)/2 + floor;
                continue;
            }
            }
            return guess;
        }
    }



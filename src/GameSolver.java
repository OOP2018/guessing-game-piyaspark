/**
 * The class that automatically solve the guessing game.
 *
 */
public class GameSolver extends NumberGame{
    /**
     *
     * @param game is the NumberGame to solve
     * @return guess number.
     */
    public int play(NumberGame game) {

        System.out.println( game.toString() );
        System.out.println( game.getMessage() );

        int guess = game.getUpperBound();
        while(true){
            System.out.println("AI guessed ");
            boolean correct = game.guess(guess);
            System.out.println(game.getMessage());
            if(correct == true)break;
            if(correct == false){
                if(game.getMessage().contains("too small."))guess += 4;
                if(game.getMessage().contains("too large."))guess -= 5;
                continue;
            }
            }
            return guess;
        }
    }



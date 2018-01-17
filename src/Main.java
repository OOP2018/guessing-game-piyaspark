/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 *
 * @author Piyaphol Wiengperm.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new ParkGame(upperBound);
		GameSolver ui = new GameSolver( );
		int solution = ui.play( game );
		System.out.println("Number of guesses: "+game.getCount());
		System.out.println("play() returned "+solution);
	}
}

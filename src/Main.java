import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 *
 * @author Piyaphol Wiengperm.
 */
public class Main extends Application{
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
//		int upperBound = 100;
//		NumberGame game = new ParkGame(upperBound);
//		GameConsole ui = new GameConsole( );
//		int solution = ui.play( game );
//		System.out.println("Number of guesses: "+game.getCount());
//		System.out.println("play() returned "+solution);

		launch(args);
	}

	/**
	 * Create user interface by using JavaFX.
	 * Show game window,count window,and secret number window.
	 * @param primaryStage
	 * @throws Exception
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		Counter counter = new Counter();
		Secret secret = new Secret();

		try {
			URL url = getClass().getResource("GameUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: GameUI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();

			Controller controller = loader.getController();

			controller.setCounter(counter);
			controller.setSecret(secret);

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("- Guessing Game -");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		ResultView resultView = new ResultView(secret);
		secret.addObserver(resultView);
		resultView.run();

		CounterView counterView = new CounterView(counter);
		counter.addObserver(counterView);
		counterView.run();
	}
}

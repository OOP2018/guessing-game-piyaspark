
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;

/**
 * Controller class for guessing game.
 * Control all the button and text field.
 * @author Piyaphol Wiengperm.
 */
public class Controller {
    @FXML
    private Button guess;
    @FXML
    private Button giveUp;
    @FXML
    private TextField textField;
    @FXML
    private Label label;
    private Counter counter;
    private Secret secret;
    private ParkGame guessingGame = new ParkGame(100);

    /**
     * A class that handle event that action on guess button.
     * when user click the button it will initialize this methods.
     * @param event
     * @throws Exception
     */
    public void guessButtonHandler(ActionEvent event) throws Exception {
        String text = textField.getText().trim();
        if(text == "")throw new Exception("Please type a number");
        int guess = Integer.parseInt(text);
        if(guess == guessingGame.getSecret()){
            label.setText("You win!!!");
            secret.setSecret(guessingGame.getSecret());
            guessingGame = new ParkGame(100);
        }else if(guess < guessingGame.getSecret()){
            label.setText("Too small!");
        }else if(guess > guessingGame.getSecret()){
            label.setText("Too large!");
        }
        textField.setText("");
        counter.add(1);
    }

    /**
     * A class that handle event that action on give up button.
     * when user click the button it will initialize this methods.
     * @param event
     */
    public void giveUpButtonHandler(ActionEvent event){
        secret.setSecret(guessingGame.getSecret());
        counter.setCount(0);
        guessingGame = new ParkGame(100);
    }

    /**
     * Set counter for controller to use.
     * @param counter is Counter class.
     */
    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    /**
     * Set secret number for controller to use.
     * @param secret is Secret class.
     */
    public void setSecret(Secret secret) { this.secret = secret; }
}

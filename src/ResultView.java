

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Observable;
/**
 * A Controller for a window that shows the value of a secret number.
 * This has only one component (but you can add more components),
 * so write it in code instead of FXML.
 *
 *@author Piyaphol Wiengperm.
 */
public class ResultView implements java.util.Observer{
    private Stage stage;
    private Label label;
    private Secret secret;

    /**
     * Constructor for ResultView.
     * @param secret is secret number.
     */
    public ResultView(Secret secret) {
        this.secret = secret;
        initComponents();
    }

    /**
     * Initialize the components of this stage.
     */
    private void initComponents() {
        stage = new Stage();
        // components and containers for our window
        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        // The label that will show the counter value.
        label = new Label("Secret: ");
        // make the label big enough
        label.setPrefWidth(144);
        label.setFont(new Font("Arial", 70.0));
        label.setAlignment(Pos.CENTER);
        // Add the label to the HBox.  You can all more components, too.
        root.getChildren().add(label);
        // Create a Scene using HBox as the root element
        Scene scene = new Scene(root);
        // show the scene on the stage
        stage.setScene(scene);
        stage.setTitle("Secret");
        stage.sizeToScene();
    }

    /** Show the window and update the secret number. */
    public void run() {
        stage.show();
        displayResult();
    }

    /**
     * Display the secret nuber that return from counter.
     */
    public void displayResult() { label.setText(String.format("%2d",secret.getSecret())); }

    /**
     * A method of observer that will update when action happened.
     * @param subject
     * @param info
     */
    @Override
    public void update(Observable subject, Object info) { displayResult(); }


}

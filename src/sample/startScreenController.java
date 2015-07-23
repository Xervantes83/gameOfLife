package sample;

/**
 * Created by Benjamin Cervantes on 7/23/2015.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class startScreenController implements Initializable {

    /**
     * @variable title game title
     */
    @FXML
    private Label title;

    /**
     * @variable newGameButton button to start new game
     */
    @FXML
    private Button newGameButton;

    /**
     * sets the boardGame scene as the main scene when the button is clicked.
     *
     * @param event the event
     */
    @FXML
    private void handleButtonAction(final ActionEvent event) {
        Main.setBoardScene();
    }

    /**
     * Initializes.
     * @param url no idea what this does, honestly
     * @param rb the resource bundle
     */
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        // TODO
    }

}

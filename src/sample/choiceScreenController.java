package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Benjamin Cervantes on 7/24/2015.
 */
public class choiceScreenController implements Initializable {

    /**
     * @variable the choice label
     */
    @FXML
    private Label choiceLabel;

    /**
     * @variable the button to return to gameBoard
     */
    @FXML
    private Button returnButton;

    /**
     * sets the boardGame scene as the main scene when the button is clicked.
     *
     * @param event the event
     */
    @FXML
    private void handleReturnButtonAction(final ActionEvent event) {
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

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
public class questionScreenController implements Initializable {
    /**
     * @variable the title label
     */
    @FXML
    private Label titleLabel;

    /**
     * @variable the question label
     */
    @FXML
    private Label questionLabel;

    /**
     * @variable button to choose choice 1
     */
    @FXML
    private Button choice1Button;

    /**
     * @variable button to choose choice 2
     */
    @FXML
    private Button choice2Button;

    /**
     * sets the choiceScreen scene as the main scene when the button is clicked.
     *
     * @param event the event
     */
    @FXML
    private void handleChoiceButtonAction(final ActionEvent event) {
        Main.setChoiceScreenScene();
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

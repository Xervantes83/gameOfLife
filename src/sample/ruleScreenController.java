package sample;

/**
 * Created by Benjamin Cervantes on 7/23/2015.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

public class ruleScreenController implements Initializable {

    /**
     * @variable backButton button to go back to startScreen
     */
    @FXML
    private Button backButton;

    /**
     * sets the startSceen scene as the main scene when the button is clicked.
     *
     * @param event the event
     */
    @FXML
    private void handleBackButtonAction(final ActionEvent event) {
        Main.setStartScreenScene();
    }

    @FXML
    private AnchorPane aPane;

    @FXML
    private StackPane sPane;

    /**
     * Initializes.
     * @param url no idea what this does, honestly
     * @param rb the resource bundle
     */
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        aPane.setTopAnchor(sPane, primaryScreenBounds.getMaxY()*1/9);
        aPane.setBottomAnchor(sPane, primaryScreenBounds.getMaxY()*1/9);
        aPane.setLeftAnchor(sPane, primaryScreenBounds.getMaxX()/5);
        aPane.setRightAnchor(sPane, primaryScreenBounds.getMaxX()/5);
    }
}

package sample;

/**
 * Created by Benjamin Cervantes on 7/24/2015.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;
import javafx.scene.image.ImageView;


public class gameBoardController implements Initializable {

    boolean p1Turn = true;
    boolean p2Turn = false;
    boolean p3Turn = false;
    boolean p4Turn = false;
    int p1X = 0;
    int p1Y = 0;
    /**
     * @variable dieButton button to roll a Die
     */
    @FXML
    private Button dieButton;

    /**
     * @variable imageView to show player local
     */
    @FXML
    private ImageView red00;
    @FXML
    private ImageView blue00;
    @FXML
    private ImageView green00;
    @FXML
    private ImageView yellow00;
    @FXML
    private ImageView red10;
    @FXML
    private ImageView blue10;
    @FXML
    private ImageView green10;
    @FXML
    private ImageView yellow10;
    @FXML
    private ImageView red20;
    @FXML
    private ImageView blue20;
    @FXML
    private ImageView green20;
    @FXML
    private ImageView yellow20;
    @FXML
    private ImageView red30;
    @FXML
    private ImageView blue30;
    @FXML
    private ImageView green30;
    @FXML
    private ImageView yellow30;
    @FXML
    private ImageView red40;
    @FXML
    private ImageView blue40;
    @FXML
    private ImageView green40;
    @FXML
    private ImageView yellow40;
    @FXML
    private ImageView red50;
    @FXML
    private ImageView blue50;
    @FXML
    private ImageView green50;
    @FXML
    private ImageView yellow50;
    @FXML
    private ImageView red60;
    @FXML
    private ImageView blue60;
    @FXML
    private ImageView green60;
    @FXML
    private ImageView yellow60;
    @FXML
    private ImageView red70;
    @FXML
    private ImageView blue70;
    @FXML
    private ImageView green70;
    @FXML
    private ImageView yellow70;

    /**
     * @return the imageView
     */
    public final ImageView getImageView() {
        if (p1Turn == true) {
            return red10;
        }
        if (p2Turn == true) {
            return blue10;
        }
        if (p3Turn == true) {
            return green10;
        }
        else{
            return yellow10;
        }
    }

    /**
     * rolls a die to generate random number from 1-6 when the button is clicked.
     * @param event the event
     */
    @FXML
    private void handleDieButtonAction(final ActionEvent event) {
        int playerMove;
        playerMove = (int)(Math.random() * 6) + 1;
        JOptionPane.showMessageDialog(null,
                "You have rolled a " + playerMove, "Player Movement",
                JOptionPane.INFORMATION_MESSAGE);
        getImageView().setVisible(false);
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

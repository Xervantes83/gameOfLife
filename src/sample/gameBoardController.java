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
import java.lang.Integer;


public class gameBoardController implements Initializable {

    final int numRows = 4;
    final int numCol = 8;
    boolean p1Turn = true;
    boolean p2Turn = false;
    boolean p3Turn = false;
    boolean p4Turn = false;
    int p1X = 0;
    int p1Y = 0;
    int p2X = 0;
    int p2Y = 0;
    int p3X = 0;
    int p3Y = 0;
    int p4X = 0;
    int p4Y = 0;

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
    @FXML
    private ImageView red01;
    @FXML
    private ImageView blue01;
    @FXML
    private ImageView green01;
    @FXML
    private ImageView yellow01;
    @FXML
    private ImageView red11;
    @FXML
    private ImageView blue11;
    @FXML
    private ImageView green11;
    @FXML
    private ImageView yellow11;
    @FXML
    private ImageView red21;
    @FXML
    private ImageView blue21;
    @FXML
    private ImageView green21;
    @FXML
    private ImageView yellow21;
    @FXML
    private ImageView red31;
    @FXML
    private ImageView blue31;
    @FXML
    private ImageView green31;
    @FXML
    private ImageView yellow31;
    @FXML
    private ImageView red41;
    @FXML
    private ImageView blue41;
    @FXML
    private ImageView green41;
    @FXML
    private ImageView yellow41;
    @FXML
    private ImageView red51;
    @FXML
    private ImageView blue51;
    @FXML
    private ImageView green51;
    @FXML
    private ImageView yellow51;
    @FXML
    private ImageView red61;
    @FXML
    private ImageView blue61;
    @FXML
    private ImageView green61;
    @FXML
    private ImageView yellow61;
    @FXML
    private ImageView red71;
    @FXML
    private ImageView blue71;
    @FXML
    private ImageView green71;
    @FXML
    private ImageView yellow71;
    @FXML
    private ImageView red02;
    @FXML
    private ImageView blue02;
    @FXML
    private ImageView green02;
    @FXML
    private ImageView yellow02;
    @FXML
    private ImageView red12;
    @FXML
    private ImageView blue12;
    @FXML
    private ImageView green12;
    @FXML
    private ImageView yellow12;
    @FXML
    private ImageView red22;
    @FXML
    private ImageView blue22;
    @FXML
    private ImageView green22;
    @FXML
    private ImageView yellow22;
    @FXML
    private ImageView red32;
    @FXML
    private ImageView blue32;
    @FXML
    private ImageView green32;
    @FXML
    private ImageView yellow32;
    @FXML
    private ImageView red42;
    @FXML
    private ImageView blue42;
    @FXML
    private ImageView green42;
    @FXML
    private ImageView yellow42;
    @FXML
    private ImageView red52;
    @FXML
    private ImageView blue52;
    @FXML
    private ImageView green52;
    @FXML
    private ImageView yellow52;
    @FXML
    private ImageView red62;
    @FXML
    private ImageView blue62;
    @FXML
    private ImageView green62;
    @FXML
    private ImageView yellow62;
    @FXML
    private ImageView red72;
    @FXML
    private ImageView blue72;
    @FXML
    private ImageView green72;
    @FXML
    private ImageView yellow72;
    @FXML
    private ImageView red03;
    @FXML
    private ImageView blue03;
    @FXML
    private ImageView green03;
    @FXML
    private ImageView yellow03;
    @FXML
    private ImageView red13;
    @FXML
    private ImageView blue13;
    @FXML
    private ImageView green13;
    @FXML
    private ImageView yellow13;
    @FXML
    private ImageView red23;
    @FXML
    private ImageView blue23;
    @FXML
    private ImageView green23;
    @FXML
    private ImageView yellow23;
    @FXML
    private ImageView red33;
    @FXML
    private ImageView blue33;
    @FXML
    private ImageView green33;
    @FXML
    private ImageView yellow33;
    @FXML
    private ImageView red43;
    @FXML
    private ImageView blue43;
    @FXML
    private ImageView green43;
    @FXML
    private ImageView yellow43;
    @FXML
    private ImageView red53;
    @FXML
    private ImageView blue53;
    @FXML
    private ImageView green53;
    @FXML
    private ImageView yellow53;
    @FXML
    private ImageView red63;
    @FXML
    private ImageView blue63;
    @FXML
    private ImageView green63;
    @FXML
    private ImageView yellow63;
    @FXML
    private ImageView red73;
    @FXML
    private ImageView blue73;
    @FXML
    private ImageView green73;
    @FXML
    private ImageView yellow73;
    /**
     * @return the imageView
     */
    public final ImageView getImageView(int playerMove) {
        if (p1Turn == true) {
            p1X = p1X + playerMove;
            if (p1X >= 8) {
                p1Y++;
            }
            p1X = p1X % numCol;
            String x = Integer.toString(p1X);
            String y = Integer.toString(p1Y);
            return red10;
        }
        if (p2Turn == true) {
            p2X = p2X + playerMove;
            if (p2X >= 8) {
                p2Y++;
            }
            p2X = p2X % numCol;
            return blue10;
        }
        if (p3Turn == true) {
            p3X = p3X + playerMove;
            if (p3X >= 8) {
                p3Y++;
            }
            p3X = p3X % numCol;
            return green10;
        }
        else{
            p4X = p4X + playerMove;
            if (p4X >= 8) {
                p4Y++;
            }
            p4X = p4X % numCol;
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
        getImageView(playerMove).setVisible(false);
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

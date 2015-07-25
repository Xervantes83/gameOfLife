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
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import java.util.ArrayList;


public class gameBoardController implements Initializable {

    final int numRows = 4;
    final int numCol = 8;
    static boolean p1Turn = true;
    static boolean p2Turn = false;
    static boolean p3Turn = false;
    static boolean p4Turn = false;
    static int currentP1 = 0;
    static int currentP2 = 0;
    static int currentP3 = 0;
    static int currentP4 = 0;
    int oldP1;
    int oldP2;
    int oldP3;
    int oldP4;
    static int p1Fears;
    static int p2Fears;
    static int p3Fears;
    static int p4Fears;


    /**
     * @variable dieButton button to roll a Die
     */
    @FXML
    private Button dieButton;

    @FXML
    private Label playerLabel;

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
        ImageView[] reds = {red00, red10, red20, red30, red40, red50, red60, red70, red01, red11, red21, red31, red41, red51, red61, red71, red02, red12, red22, red32, red42, red52, red62, red72, red03, red13, red23, red43, red53, red63, red73};
        ImageView[] blues = {blue00, blue10, blue20, blue30, blue40, blue50, blue60, blue70, blue01, blue11, blue21, blue31, blue41, blue51, blue61, blue71, blue02, blue12, blue22, blue32, blue42, blue52, blue62, blue72, blue03, blue13, blue23, blue43, blue53, blue63, blue73};
        ImageView[] greens = {green00, green10, green20, green30, green40, green50, green60, green70, green01, green11, green21, green31, green41, green51, green61, green71, green02, green12, green22, green32, green42, green52, green62, green72, green03, green13, green23, green43, green53, green63, green73};
        ImageView[] yellows = {yellow00, yellow10, yellow20, yellow30, yellow40, yellow50, yellow60, yellow70, yellow01, yellow11, yellow21, yellow31, yellow41, yellow51, yellow61, yellow71, yellow02, yellow12, yellow22, yellow32, yellow42, yellow52, yellow62, yellow72, yellow03, yellow13, yellow23, yellow43, yellow53, yellow63, yellow73};
        if (p1Turn) {
            oldP1 = currentP1;
            reds[oldP1].setVisible(false);
            currentP1 = currentP1 + playerMove;
            playerLabel.setText("Player 2 Turn");
            return reds[currentP1];
        }
        if (p2Turn) {
            oldP2 = currentP2;
            blues[oldP2].setVisible(false);
            currentP2 = currentP2 + playerMove;
            playerLabel.setText("Player 3 Turn");
            return blues[currentP2];
        }
        if (p3Turn) {
            oldP3 = currentP3;
            greens[oldP3].setVisible(false);
            currentP3 = currentP3 + playerMove;
            playerLabel.setText("Player 4 Turn");
            return greens[currentP3];
        }
        else{
            oldP4 = currentP4;
            yellows[oldP4].setVisible(false);
            currentP4 = currentP4 + playerMove;
            playerLabel.setText("Player 1 Turn");
            return yellows[currentP4];
        }
    }

    public static int lifeQuestNum = 0;
    public static int acaQuestNum = 0;
    public static int persQuestNum = 0;
    /**
     * rolls a die to generate random number from 1-6 when the button is clicked.
     * and moves character icon to match it
     * @param event the event
     */
    @FXML
    private void handleDieButtonAction(final ActionEvent event) {
        int playerMove;
        playerMove = (int)(Math.random() * 6) + 1;
        getImageView(playerMove).setVisible(true);
        JOptionPane.showMessageDialog(null,
                "You have rolled a " + playerMove, "Player Movement",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(currentP1 + " - " + currentP2 + " - " + currentP3 + " - " + currentP4);
        String tempName = Main.getQuestionTitle(getPlayerLocation());
        questionScreenController.titleLabel.setText(tempName);

        String temp = "";
        if(tempName.equals("Life Problems")) {
            temp = Main.lifeQuestions.get(0).get(lifeQuestNum);
        } else if(tempName.equals("Academic Problems")) {
            temp = Main.academicQuestions.get(0).get(acaQuestNum);
        } else if(tempName.equals("Personal Problems")) {
            temp = Main.personalQuestions.get(0).get(persQuestNum);
        }

        questionScreenController.questionLabel.setText(temp);
        Main.setQuestionScreenScene();
    }

    public static void switchTurns() {
        if (p1Turn) {
            p1Turn = false;
            p2Turn = true;
        } else if (p2Turn) {
            p2Turn = false;
            p3Turn = true;
        } else if (p3Turn) {
            p3Turn = false;
            p4Turn = true;
        } else if (p4Turn) {
            p4Turn = false;
            p1Turn = true;
        } else {
            return;
        }
    }

    /**
     * get player location
     */
    public static int getPlayerLocation() {
        if (p1Turn) {
            return currentP1;
        } else if (p2Turn) {
            return currentP2;
        } else if (p3Turn) {
            return currentP3;
        } else if (p4Turn){
            return currentP4;
        } else {
            return 0;
        }
    }

    /**
     * Initializes.
     * @param url no idea what this does, honestly
     * @param rb the resource bundle
     */
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        red00.setVisible(true);
        p1Fears = 0;
        blue00.setVisible(true);
        p2Fears = 0;
        green00.setVisible(true);
        p3Fears = 0;
        yellow00.setVisible(true);
        p4Fears = 0;
    }
}

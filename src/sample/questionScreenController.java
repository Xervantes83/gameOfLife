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
    private Label titleLabel_;

    public static Label titleLabel;

    final int lifeTiles[] = {1, 4, 10, 13, 19, 22, 25, 28};
    final int academicTiles[] = {2, 5, 11, 14, 17, 20, 26, 29};
    final int personalTiles[] = {3, 6, 9, 12, 18, 21, 27, 30};
    final int summerTiles[] = {7, 15, 23, 31};
    final String[] names = {"Life Problems", "Academic Problems", "Personal Problems"};

    /**
     * @variable the question label
     */
    @FXML
    private Label questionLabel_;

    public static Label questionLabel;

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
    private void handleChoice1ButtonAction(final ActionEvent event) {
        String tempName = Main.getQuestionTitle(gameBoardController.getPlayerLocation());
        questionScreenController.titleLabel.setText(tempName);
        gameBoardController.switchTurns();
        String temp = "";
        if(tempName.equals("Life Problems")) {
            temp = Main.lifeQuestions.get(1).get(gameBoardController.lifeQuestNum);
            gameBoardController.lifeQuestNum++;
        } else if(tempName.equals("Academic Problems")) {
            temp = Main.academicQuestions.get(1).get(gameBoardController.acaQuestNum);
            gameBoardController.acaQuestNum++;
        } else if(tempName.equals("Personal Problems")) {
            temp = Main.personalQuestions.get(1).get(gameBoardController.persQuestNum);
            gameBoardController.persQuestNum++;
        }
        choiceScreenController.choiceLabel.setText(temp);
        Main.setChoiceScreenScene();
    }

    @FXML
    private void handleChoice2ButtonAction(final ActionEvent event) {
        String tempName = Main.getQuestionTitle(gameBoardController.getPlayerLocation());
        questionScreenController.titleLabel.setText(tempName);
        gameBoardController.switchTurns();
        String temp = "";
        if(tempName.equals("Life Problems")) {
            temp = Main.lifeQuestions.get(2).get(gameBoardController.lifeQuestNum);
            gameBoardController.lifeQuestNum++;
        } else if(tempName.equals("Academic Problems")) {
            temp = Main.academicQuestions.get(2).get(gameBoardController.acaQuestNum);
            gameBoardController.acaQuestNum++;
        } else if(tempName.equals("Personal Problems")) {
            temp = Main.personalQuestions.get(2).get(gameBoardController.persQuestNum);
            gameBoardController.persQuestNum++;
        }
        choiceScreenController.choiceLabel.setText(temp);
        Main.setChoiceScreenScene();
    }

    /**
     * Initializes.
     * @param url no idea what this does, honestly
     * @param rb the resource bundle
     */
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        titleLabel_ = titleLabel;
        questionLabel_ = questionLabel;
    }
}

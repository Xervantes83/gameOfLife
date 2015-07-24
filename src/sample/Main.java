package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage PrimaryStage;
    private static Scene main;
    private static Scene startScreen;
    private static Scene gameBoardScreen;
    private static Scene ruleScreen;

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        Parent gameBoard = FXMLLoader.load(getClass().getResource("gameBoard.fxml"));
        Parent rule = FXMLLoader.load(getClass().getResource("ruleScreen.fxml"));

        main = new Scene(root);
        gameBoardScreen = new Scene(gameBoard);
        ruleScreen = new Scene(rule);


        PrimaryStage = stage;
        PrimaryStage.setTitle("The Game of Life");
        PrimaryStage.setScene(main);
        PrimaryStage.show();
    }

    /**
     * sets the scene to the boardGame scene
     */
    public static void setBoardScene() {
        PrimaryStage.setScene(gameBoardScreen);
    }

    /**
     * sets the scene to the rule scene
     */
    public static void setRuleScene() {
        PrimaryStage.setScene(ruleScreen);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

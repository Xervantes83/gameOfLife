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

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        Parent gameBoard = FXMLLoader.load(getClass().getResource("gameBoard.fxml"));

        main = new Scene(root);
        gameBoardScreen = new Scene(gameBoard);

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

    public static void main(String[] args) {
        launch(args);
    }
}

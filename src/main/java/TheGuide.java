import controller.LauncherController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.GuideUtils;

import java.io.IOException;

/**
 * Created by Aaron on 21.11.2016.
 */
public class TheGuide extends Application{

    Stage stage;

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("the guide launcher");

        //load fxml and set up controller
        Parent launcher = GuideUtils.loadFXML("launcher.fxml", stage);

        stage.setScene(new Scene(launcher, 400, 300));
        stage.show();
    }

}

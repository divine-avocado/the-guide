package controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.GuideUtils;

import java.io.IOException;

/**
 * Created by Aaron on 28.11.2016.
 */
public class LauncherController implements Controller{

    Stage stage;

    @FXML
    public void guideButtonClicked() throws IOException {
        Parent root = GuideUtils.loadFXML("guide.fxml", stage);
        stage.setScene(new Scene(root, 800, 600));
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}

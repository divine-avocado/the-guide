package utils;

import controller.Controller;
import controller.LauncherController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Aaron on 28.11.2016.
 */
public class GuideUtils {

    public static Parent loadFXML(String name, Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(GuideUtils.class.getClassLoader().getResource("fxml/" + name));
        Parent root = loader.load();
        Controller controller = loader.getController();
        if(controller == null)
            throw new NullPointerException("No controller defined in " + name);
        controller.setStage(stage);
        return root;
    }
}

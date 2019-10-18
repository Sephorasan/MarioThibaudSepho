import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;


public class Main extends Application {
    private Stage primaryStage;
    private Scene scene, scene2, scene3, scene4;
    private ImageView mario;
    private ImageView fond1;
}

public static void main(String[] args){Application.launch(Main.class, args);}

@Override
public void start(Stage primaryStage){
    this.primaryStage = primaryStage;
    primaryStage.setTitle("MARIO");
    Group root = new Group();
    Group root2 = new Group();
    Group root3 = new Group();
    Group root4 = new Group();
    Scene scene = new Scene(root);
    Scene scene2 = new Scene(root2);
    Scene scene3 = new Scene(root3);
    Scene scene4 = new Scene(root4);
    Text texte = new Text();

}

private void initBackground(){
    fond1 = new ImageView();
    Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    fond1.setFitHeight((int) primaryScreenBounds.getHeight());
    fond1.setFitWidth((int) primaryScreenBounds.getWidth();
}

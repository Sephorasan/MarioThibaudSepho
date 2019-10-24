import View.ViewHandler;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;



public class Main extends Application {
    private Scene scene, scene2, scene3, scene4;
    private ImageView mario;
    private ImageView fond1;


    public static void main(String[] args){Application.launch(ViewHandler.class, args);}


    private void initBackground(){
    fond1 = new ImageView("Asset/Image/fond1.png");
    Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    fond1.setFitHeight((int) primaryScreenBounds.getHeight());
    fond1.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }



}
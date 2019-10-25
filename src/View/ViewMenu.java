package View;

import Tool.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class ViewMenu{
    private Stage primaryStage;
    private Group root;
    private ImageView fond1;
    private Text Title, Jouer, Options, Quitter;

    ViewMenu(Group root) {
        this.root = root;
        initBackground();
        initTexte();
        setVueMenu();
    }

    private void initTexte(){
            Title = new Text("Mario Démineur");
            Jouer = new Text("Jouer");
            Options  = new Text("Options");
            Quitter = new Text("Quitter");
            Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase),30);
            Title.setFont(policeTitre);
            Title.setFill(Color.RED);
            Jouer.setFont(policeTitre);
            Jouer.setFill(Color.RED);
            Jouer.setX();
            Jouer.setY();
            Options.setFont(policeTitre);
            Options.setFill(Color.RED);
            Quitter.setFont(policeTitre);
            Quitter.setFill(Color.RED);
            Quitter.setOnMouseClicked(event -> primaryStage.close());
        /*
        Options.setOnMouseClicked(event -> primaryStage.setScene(scene3));

*/
    }
        private void initBackground(){
        fond1 = new ImageView("Asset/Image/fond3.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond1.setFitHeight((int) primaryScreenBounds.getHeight());
        fond1.setFitWidth((int) primaryScreenBounds.getWidth());
    }
        void setVueMenu(){
        root.getChildren().clear();
        root.getChildren().addAll(fond1);
        root.getChildren().add(Title);
        root.getChildren().add(Jouer);
        root.getChildren().add(Options);
        root.getChildren().add(Quitter);
    }

}

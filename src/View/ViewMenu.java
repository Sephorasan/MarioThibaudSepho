package View;

import Controller.ControllerMenu;
import Tool.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class ViewMenu {
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
            Title = new Text("Mario l'explorateur");
            Jouer = new Text("Jouer");
            Options  = new Text("Options");
            Quitter = new Text("Quitter");
            Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase),60);
            Title.setFont(policeTitre);
            Title.setFill(Color.RED);
            Title.setX(550);
            Title.setY(200);
            Jouer.setFont(policeTitre);
            Jouer.setFill(Color.WHITE);
            Jouer.setX(700);
            Jouer.setY(450);
            Options.setFont(policeTitre);
            Options.setFill(Color.WHITE);
            Options.setX(700);
            Options.setY(600);
            Quitter.setFont(policeTitre);
            Quitter.setFill(Color.WHITE);
            Quitter.setX(700);
            Quitter.setY(750);
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
    public Text getLancerJeu(){
        return Jouer;
    }
    public Text getOptions(){
        return Options;
    }
    public Text getQuitter(){
        return Quitter;
    }

    void setEvents(ControllerMenu cm) {
        Jouer.setOnMouseClicked(cm);
        Options.setOnMouseClicked(cm);
        Quitter.setOnMouseClicked(cm);

    }
}

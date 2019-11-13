package View;

import Controller.ControllerJeu;
import Tool.Path;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.util.Duration;

public class ViewPersoK {
    private Group root;
    private ImageView kirby;
    private ImageView fond;
    private ImageView etoile;
    private Text retour;

    ViewPersoK(Group root) {
        this.root = root;
        initBackground();
        initPersoK();
        initEtoile();
        initTexte();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/fond2.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initEtoile(){
        etoile = new ImageView("Asset/Image/ennemi.gif");
        etoile.setX(0);
        etoile.setY(300);
        etoile.setScaleX(0.2);
        etoile.setScaleY(0.2);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(etoile.xProperty(), 1100);
        final KeyFrame kf = new KeyFrame(Duration.millis(5000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }
    private void initTexte() {
        retour = new Text("Retour");
        Font police = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 40);
        retour.setX(1100);
        retour.setY(200);
        retour.setFont(police);
        retour.setFill(Color.BLACK);
    }

    private void initPersoK() {
        kirby = new ImageView("Asset/Image/kirby.gif");
        kirby.setX(180);
        kirby.setY(620);
        kirby.setScaleX(0.3);
        kirby.setScaleY(0.3);
    }

    void setVuePersoK(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(kirby);
        root.getChildren().add(etoile);
        root.getChildren().add(retour);
    }
    public Text getRetour() {
        return retour;
    }

    public void moveLeft() {
        if (kirby.getX() > -20) {
            kirby.setX(kirby.getX() - 10);
        }
    }

    public void moveRight() {
        kirby.setX(kirby.getX() + 10);
    }
    void setEvents(ControllerJeu cj) {
        retour.setOnMouseClicked(cj);

    }

}




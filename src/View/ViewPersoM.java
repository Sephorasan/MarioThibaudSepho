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

public class ViewPersoM {
    private Group root;
    private ImageView mario2;
    private ImageView fond;
    private ImageView champi;
    private Text retour;

    ViewPersoM(Group root) {
        this.root = root;
        initBackground();
        initPersoM();
        initChampi();
        initTexte();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/fond.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initChampi(){
        champi = new ImageView("Asset/Image/champi.png");
        champi.setX(0);
        champi.setY(450);
        champi.setScaleX(0.3);
        champi.setScaleY(0.3);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(champi.xProperty(), 1100);
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
    private void initPersoM() {
        mario2 = new ImageView("Asset/Image/mario.gif");
        mario2.setX(180);
        mario2.setY(530);
        mario2.setScaleX(0.3);
        mario2.setScaleY(0.3);
    }

    void setVuePersoM(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(mario2);
        root.getChildren().add(champi);
        root.getChildren().add(retour);
    }
    public Text getRetour() {
        return retour;
    }

    public void moveLeft() {
        if (mario2.getX() > -20) {
            mario2.setX(mario2.getX() - 10);
        }
    }

    public void moveRight() {
        mario2.setX(mario2.getX() + 10);
    }
    void setEvents(ControllerJeu cj) {
        retour.setOnMouseClicked(cj);

    }

}


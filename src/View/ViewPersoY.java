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

public class ViewPersoY {
    private Group root;
    private ImageView yoshi;
    private ImageView fond;
    private ImageView oeuf;
    private Text retour;

    ViewPersoY(Group root) {
        this.root = root;
        initBackground();
        initPersoY();
        initOeuf();
        initTexte();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/fond3.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }
    private void initOeuf(){
        oeuf = new ImageView("Asset/Image/euf.gif");
        oeuf.setX(0);
        oeuf.setY(680);
        oeuf.setScaleX(0.2);
        oeuf.setScaleY(0.2);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(oeuf.xProperty(), 1100);
        final KeyFrame kf = new KeyFrame(Duration.millis(5000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }

    private void initPersoY() {
        yoshi = new ImageView("Asset/Image/yoshi.gif");
        yoshi.setX(180);
        yoshi.setY(630);
        yoshi.setScaleX(0.3);
        yoshi.setScaleY(0.3);
    }
    private void initTexte() {
        retour = new Text("Retour");
        Font police = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 40);
        retour.setX(1100);
        retour.setY(200);
        retour.setFont(police);
        retour.setFill(Color.BLACK);
    }

    void setVuePersoY(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(yoshi);
        root.getChildren().add(oeuf);
        root.getChildren().add(retour);
    }
    public Text getRetour() {
        return retour;
    }

    public void moveLeft() {
        if (yoshi.getX() > -20) {
            yoshi.setX(yoshi.getX() - 10);
        }
    }

    public void moveRight() {
        yoshi.setX(yoshi.getX() + 10);
    }

    void setEvents(ControllerJeu cj) {
        retour.setOnMouseClicked(cj);

    }

}


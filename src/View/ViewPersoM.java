package View;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.util.Duration;

public class ViewPersoM {
    private Group root;
    private ImageView mario2;
    private ImageView fond;
    private ImageView champi;

    ViewPersoM(Group root) {
        this.root = root;
        initBackground();
        initPersoM();
        initChampi();
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
    }

}


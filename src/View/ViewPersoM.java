package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewPersoM {
    private Group root;
    private ImageView mario2;
    private ImageView fond;

    ViewPersoM(Group root) {
        this.root = root;
        initBackground();
        initPersoM();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
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
    }

}


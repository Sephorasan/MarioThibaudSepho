package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewPersoY {
    private Group root;
    private ImageView yoshi;
    private ImageView fond;

    ViewPersoY(Group root) {
        this.root = root;
        initBackground();
        initPersoY();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPersoY() {
        yoshi = new ImageView("Asset/Image/yoshi.gif");
        yoshi.setX(180);
        yoshi.setY(530);
        yoshi.setScaleX(0.3);
        yoshi.setScaleY(0.3);
    }

    void setVuePersoY(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(yoshi);
    }

}


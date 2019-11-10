package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewPersoK {
    private Group root;
    private ImageView kirby;
    private ImageView fond;

    ViewPersoK(Group root) {
        this.root = root;
        initBackground();
        initPersoK();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPersoK() {
        kirby = new ImageView("Asset/Image/kirby.gif");
        kirby.setX(180);
        kirby.setY(530);
        kirby.setScaleX(0.3);
        kirby.setScaleY(0.3);
    }

    void setVuePersoK(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(kirby);
    }

}




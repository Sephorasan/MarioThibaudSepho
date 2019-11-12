package View;

import Controller.ControllerClavierJeu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

import static java.awt.image.ImageObserver.WIDTH;


public class ViewJeu {
    private Group root;
    private ImageView mario;
    private ImageView fond;

    ViewJeu(Group root) {
        this.root = root;
        initBackground();
        initPerso();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPerso() {
        mario = new ImageView("Asset/Image/mario.gif");
        mario.setX(180);
        mario.setY(630);
        mario.setScaleX(0.3);
        mario.setScaleY(0.3);
    }

    void setVueJeu(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(mario);
    }
    public void moveLeft() {
        if (mario.getX() > -20) {
            mario.setX(mario.getX() - 3);
        }
    }
    public void moveRight() {
        if (mario.getX() < WIDTH - 23) {
            mario.setX(mario.getX() + 3);
        }
    }

}

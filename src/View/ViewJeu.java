package View;

import Controller.ControllerClavierJeu;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.util.Duration;


public class ViewJeu {
    private Group root;
    private ImageView mario;
    private ImageView fond;
    private ImageView obstacle;

    ViewJeu(Group root) {
        this.root = root;
        initBackground();
        initPerso();
        initObstacle();
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/fond.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPerso() {
        mario = new ImageView("Asset/Image/mario.gif");
        mario.setX(180);
        mario.setY(550);
        mario.setScaleX(0.3);
        mario.setScaleY(0.3);
    }

    private void initObstacle() {
        obstacle = new ImageView("Asset/Image/tuyau.png");
        obstacle.setX(500);
        obstacle.setY(550);
        obstacle.setScaleX(0.3);
        obstacle.setScaleY(0.3);
    }

    void setVueJeu(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(mario);
        root.getChildren().add(obstacle);

    }
    public void moveLeft() {
        if (mario.getX() > -20) {
            mario.setX(mario.getX() - 8);
        }
    }
    public void moveRight() {
            mario.setX(mario.getX() + 8);
    }
    public void jump(){

    }

}

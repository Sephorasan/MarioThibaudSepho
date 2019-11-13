package View;

import Controller.ControllerClavierJeu;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.util.Duration;


public class ViewJeu {
    private Group root;
    private ImageView mario;
    private ImageView fond;
    private ImageView obstacle;
    private ImageView ennemi;

    ViewJeu(Group root) {
        this.root = root;
        initBackground();
        initPerso();
        initObstacle();
        initEnnemi();
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

    private void initEnnemi(){
        ennemi = new ImageView("Asset/Image/ennemi.gif");
        ennemi.setX(250);
        ennemi.setY(600);
        ennemi.setScaleX(0.2);
        ennemi.setScaleY(0.2);
        Path path = new Path();
        path.getElements().add(new MoveTo(20,20));
        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(ennemi);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();

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
        root.getChildren().add(ennemi);

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

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
    private ImageView ennemi2;
    private ImageView ennemi3;


    ViewJeu(Group root) {
        this.root = root;
        initBackground();
        initPerso();
        initObstacle();
        initEnnemi();
        initEnnemi2();
        initEnnemi3();

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

    private void initEnnemi() {
        ennemi = new ImageView("Asset/Image/ennemi.gif");


        ennemi.setX(1000);
        ennemi.setY(1000);
        ennemi.setScaleX(0.2);
        ennemi.setScaleY(0.2);
        Path path = new Path();
        path.getElements().add(new MoveTo(0, 900));
        path.getElements().add(new CubicCurveTo(0, 0, 0, 0, 0, 900));
        path.getElements().add(new CubicCurveTo(0, 0, 0, 0, 0, 0));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setPath(path);
        pathTransition.setNode(ennemi);

        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();
    }
        private void initEnnemi2(){
        ennemi2 = new ImageView("Asset/Image/ennemi.gif");
        ennemi2.setX(1000);
        ennemi2.setY(1000);
        ennemi2.setScaleX(0.2);
        ennemi2.setScaleY(0.2);
        Path path2 = new Path();
        path2.getElements().add(new MoveTo(500,900));
        path2.getElements().add(new CubicCurveTo(500, 0, 500, 0, 500, 900));
        path2.getElements().add(new CubicCurveTo(500, 0, 500, 0, 500, 0));
        PathTransition pathTransition2 = new PathTransition();
            pathTransition2.setDuration(Duration.millis(3000));
        pathTransition2.setPath(path2);
        pathTransition2.setNode(ennemi2);

        pathTransition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition2.setCycleCount(Timeline.INDEFINITE);
        pathTransition2.setAutoReverse(true);
        pathTransition2.play();

    }
    private void initEnnemi3(){
        ennemi3 = new ImageView("Asset/Image/ennemi.gif");
        ennemi3.setX(1000);
        ennemi3.setY(1000);
        ennemi3.setScaleX(0.2);
        ennemi3.setScaleY(0.2);
        Path path3 = new Path();
        path3.getElements().add(new MoveTo(1000,900));
        path3.getElements().add(new CubicCurveTo(1000, 0, 1000, 0, 1000, 900));
        path3.getElements().add(new CubicCurveTo(1000, 0, 1000, 0, 1000, 0));
        PathTransition pathTransition3 = new PathTransition();
        pathTransition3.setDuration(Duration.millis(2500));
        pathTransition3.setPath(path3);
        pathTransition3.setNode(ennemi3);

        pathTransition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition3.setCycleCount(Timeline.INDEFINITE);
        pathTransition3.setAutoReverse(true);
        pathTransition3.play();

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
        root.getChildren().add(ennemi2);
        root.getChildren().add(ennemi3);


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

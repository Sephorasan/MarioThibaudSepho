package View;

import Controller.ControllerJeu;
import Controller.ControllerMenu;
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


public class ViewJeu {
    private Group root;
    private ImageView mario;
    private ImageView fond;
    private ImageView obstacle;
    private ImageView champi;
    private Text retour;


    ViewJeu(Group root) {
        this.root = root;
        initBackground();
        initPerso();
        initObstacle();
        initChampi();
        initTexte();
    }

    private void initBackground() {
        fond = new ImageView("Asset/Image/fond.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPerso() {
        mario = new ImageView("Asset/Image/mario.gif");
        mario.setX(180);
        mario.setY(540);
        mario.setScaleX(0.3);
        mario.setScaleY(0.3);
    }

    /*
    private void initEnnemi(){
        ennemi = new ImageView("Asset/Image/ennemi.gif");
        ennemi.setX(250);
        ennemi.setY(600);
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
        path2.getElements().add(new CubicCurveTo(300, 0, 300, 0, 500, 700));
        path2.getElements().add(new CubicCurveTo(500, 0, 500, 0, 500, 0));
        PathTransition pathTransition2 = new PathTransition();
        pathTransition2.setDuration(Duration.millis(3000));
        pathTransition2.setPath(path2);
        pathTransition2.setNode(ennemi2);
        pathTransition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition2.setCycleCount(Timeline.INDEFINITE);
        pathTransition2.setAutoReverse(true);
        pathTransition2.play();
    }*/
    private void initChampi() {
        champi = new ImageView("Asset/Image/champignon.png");
        champi.setX(0);
        champi.setY(580);
        champi.setScaleX(0.2);
        champi.setScaleY(0.2);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(champi.xProperty(), 1100);
        final KeyFrame kf = new KeyFrame(Duration.millis(5000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }

    private void initObstacle() {
        obstacle = new ImageView("Asset/Image/tuyau.png");
        obstacle.setX(500);
        obstacle.setY(400);
        obstacle.setScaleX(0.3);
        obstacle.setScaleY(0.3);
    }

    private void initTexte() {
        retour = new Text("Retour");
        Font police = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 40);
        retour.setX(1100);
        retour.setY(200);
        retour.setFont(police);
        retour.setFill(Color.BLACK);
    }

    void setVueJeu() {
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(mario);
        root.getChildren().add(obstacle);
        root.getChildren().add(champi);
        root.getChildren().add(retour);
    }

    public Text getRetour() {
        return retour;
    }

    public void moveLeft() {
        if (mario.getX() > -20) {
            mario.setX(mario.getX() - 10);
        }
    }

    public void moveRight() {
        mario.setX(mario.getX() + 10);
    }

    public void jump() {

    }

    void setEvents(ControllerJeu cj) {
        retour.setOnMouseClicked(cj);

    }
}

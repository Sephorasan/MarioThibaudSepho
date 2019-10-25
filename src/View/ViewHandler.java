package View;

import Tool.Path;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;


public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene, scene2, scene3, scene4;
    private ImageView mario;
    private ImageView yoshi;
    private ImageView mario2;
    private ImageView fond1;
    private ImageView fond2;
    private ImageView fond3;


    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MARIO");
        Group root = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Group root4 = new Group();
        Scene scene = new Scene(root, 800,500, Color.BLACK);
        Scene scene2 = new Scene(root2, Color.BLACK);
        Scene scene3 = new Scene(root3, Color.BLACK);
        Scene scene4 = new Scene(root4);
        Text texte = new Text();
        Text texteM = new Text();
        Text texteY = new Text();
        Text Jouer = new Text();
        Text Options = new Text();
        Text Quitter = new Text();

        final File file = new File("src/Asset/Son/mario-theme.mp3");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);

        texte.setText("MARIO DEMINEUR");
        texte.setX(350);
        texte.setY(250);
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 70);
        texte.setFont(policeTitre);
        texte.setFill(Color.RED);

        texteM.setText("MARIO");
        texteM.setX(750);
        texteM.setY(750);
        Font policeTitreM = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        texteM.setFont(policeTitreM);
        texteM.setFill(Color.RED);

        texteY.setText("YOSHI");
        texteY.setX(350);
        texteY.setY(750);
        Font policeTitreY = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        texteY.setFont(policeTitreY);
        texteY.setFill(Color.GREEN);

        Jouer.setText("Jouer");
        Jouer.setX(700);
        Jouer.setY(450);
        Font policeTitreJ = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Jouer.setFont(policeTitreJ);
        Jouer.setFill(Color.WHITE);
        Jouer.setOnMouseClicked(event -> primaryStage.setScene(scene2));

        Options.setText("Options");
        Options.setX(700);
        Options.setY(500);
        Font policeTitreO = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Options.setFont(policeTitreO);
        Options.setFill(Color.WHITE);
        Options.setOnMouseClicked(event -> primaryStage.setScene(scene3));

        Quitter.setText("Quitter");
        Quitter.setX(700);
        Quitter.setY(550);
        Font policeTitreQ = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Quitter.setFont(policeTitreQ);
        Quitter.setFill(Color.WHITE);
        Quitter.setOnMouseClicked(event -> primaryStage.close());

        initBackground();
        initBackground2();
        initPerso1();
        initSaute();
        //initBackground3();
        initPerso2();
        initPerso3();

        root.getChildren().addAll(fond1);
        root.getChildren().add(texte);
        root.getChildren().add(Jouer);
        root.getChildren().add(Options);
        root.getChildren().add(Quitter);
        root2.getChildren().addAll(fond2);
        root2.getChildren().add(mario);
        //root3.getChildren().addAll(fond3);
        root3.getChildren().add(yoshi);
        root3.getChildren().add(mario2);
        root3.getChildren().add(texteM);
        root3.getChildren().add(texteY);

        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.setScene(scene2);
        primaryStage.setTitle("Mario");
        //primaryStage.setFullScreenExitHint("");
        //primaryStage.setResizable(false);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        mediaPlayer.play();

    }

    private void initBackground(){
        fond1 = new ImageView("Asset/Image/fond3.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond1.setFitHeight((int) primaryScreenBounds.getHeight());
        fond1.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initBackground2(){
        fond2 = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond2.setFitHeight((int) primaryScreenBounds.getHeight());
        fond2.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPerso1() {
        mario = new ImageView("Asset/Image/mario.gif");
        mario.setX(180);
        mario.setY(630);
        mario.setScaleX(0.3);
        mario.setScaleY(0.3);
    }
    private void initPerso2() {
        yoshi = new ImageView("Asset/Image/yoshi.gif");
        yoshi.setX(200);
        yoshi.setY(450);
        yoshi.setScaleX(0.5);
        yoshi.setScaleY(0.5);
    }
    private void initPerso3() {
        mario2 = new ImageView("Asset/Image/mario.gif");
        mario2.setX(600);
        mario2.setY(500);
        mario2.setScaleX(0.6);
        mario2.setScaleY(0.6);
    }

    private void initSaute(){
        mario.setOnMousePressed(event -> mario.setLayoutY(-30));
        mario.setOnMouseReleased(event -> mario.setLayoutY(0));
    }
    /*
    private void initBackground3(){
        fond3 = new ImageView("Asset/Image/fond1.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond3.setFitHeight((int) primaryScreenBounds.getHeight());
        fond3.setFitWidth((int) primaryScreenBounds.getWidth());
    }*/

}

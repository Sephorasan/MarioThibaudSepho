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
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

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

        final File file = new File("src/Asset/Son/mario-theme.mp3");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);

        btn1 = initButton(700,400,"Jouer");
        btn2 = initButton(700,450,"Options");
        btn3 = initButton(700,500,"Quitter");
        btn4 = initButton(700,500,"Retour");


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

        btn1.setOnAction(event -> primaryStage.setScene(scene2));
        btn2.setOnAction(event -> primaryStage.setScene(scene3));
        btn3.setOnAction(event -> primaryStage.close());
        btn4.setOnAction(event -> primaryStage.setScene(scene));

        initBackground();
        initBackground2();
        initPerso1();
        initSaute();
        //initBackground3();
        initPerso2();
        initPerso3();

        root.getChildren().addAll(fond1);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(texte);
        root2.getChildren().addAll(fond2);
        root2.getChildren().add(btn4);
        root2.getChildren().add(mario);
        //root3.getChildren().addAll(fond3);
        root3.getChildren().add(yoshi);
        root3.getChildren().add(mario2);
        root3.getChildren().add(texteM);
        root3.getChildren().add(texteY);

        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
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

    private Button initButton(int longueur, int largeur, String texteDuBouton) {
        Button bouton = new Button();
        bouton.setLayoutX(longueur);
        bouton.setLayoutY(largeur);
        bouton.setText(texteDuBouton);
        return bouton;
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
    private void initBackground3(){
        fond3 = new ImageView("Asset/Image/fond1.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond3.setFitHeight((int) primaryScreenBounds.getHeight());
        fond3.setFitWidth((int) primaryScreenBounds.getWidth());
    }
}

package View;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class ViewHandler extends Application {
    private Stage primaryStage;
    private Scene scene, scene2, scene3, scene4;
    private ImageView mario;
    private ImageView fond1;
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MARIO");
        Group root = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Group root4 = new Group();
        Scene scene = new Scene(root, 800,500, Color.BLACK);
        Scene scene2 = new Scene(root2, 800,500, Color.WHITE);
        Scene scene3 = new Scene(root3, 800,500, Color.PINK);
        Scene scene4 = new Scene(root4);
        Text texte = new Text();

        btn1 = initButton(700,400,"Jouer");
        btn2 = initButton(700,450,"Options");
        btn3 = initButton(700,500,"Quitter");
        texte.setText("MARIO-PELLE");
        texte.setX(550);
        texte.setY(250);
        texte.setFont(new Font("Indie flower",60));
        texte.setFill(Color.ORANGE);

        btn1.setOnAction(event -> primaryStage.setScene(scene2));
        btn2.setOnAction(event -> primaryStage.setScene(scene3));
        btn3.setOnAction(event -> primaryStage.close());

        initBackground();
        initPerso();
        initMarche();
        initSaute();

        root.getChildren().addAll(fond1);
        root.getChildren().add(mario);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(texte);

        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mario");
        //primaryStage.setFullScreenExitHint("");
        //primaryStage.setResizable(false);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();

    }

    private void initBackground(){
        fond1 = new ImageView("Asset/Image/fond1.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond1.setFitHeight((int) primaryScreenBounds.getHeight());
        fond1.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private Button initButton(int longueur, int largeur, String texteDuBouton) {
        Button bouton = new Button();
        bouton.setLayoutX(longueur);
        bouton.setLayoutY(largeur);
        bouton.setText(texteDuBouton);
        return bouton;
    }
    private void initPerso() {
        mario = new ImageView("Asset/Image/mario.gif");
        mario.setX(180);
        mario.setY(662);
        mario.setScaleX(0.2);
        mario.setScaleY(0.2);
    }

    private void initMarche(){
        mario.setOnMouseEntered(event -> mario.setLayoutX(+20));
    }

    private void initSaute(){
        mario.setOnMousePressed(event -> mario.setLayoutY(-30));
        mario.setOnMouseReleased(event -> mario.setLayoutY(0));
    }
}

package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;


public class ViewJeu {
    private Group root;
    private ImageView mario;
    private ImageView fond2;
    private Text Retour;

    ViewJeu(Group root) {
        this.root = root;
        initBackground2();
        initPerso1();
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

    void setVueJeu(){
        root.getChildren().clear();
        root.getChildren().addAll(fond2);
        root.getChildren().add(mario);
        root.getChildren().add(Retour);
    }

    /*
        Retour.setText("Retour");
        Retour.setX(1000);
        Retour.setY(200);
        Font policeTitreR = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Retour.setFont(policeTitreR);
        Retour.setFill(Color.WHITE);
        Retour.setOnMouseClicked(event -> primaryStage.setScene(scene));

        */



}

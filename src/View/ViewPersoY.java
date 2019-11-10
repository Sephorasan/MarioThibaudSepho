package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewPersoY {
    private Group root;
    private ImageView yoshi;
    private ImageView fond;
    //private Text Retour;

    ViewPersoY(Group root) {
        this.root = root;
        initBackground2();
        initPersoY();
    }

    private void initBackground2(){
        fond = new ImageView("Asset/Image/herbe.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void initPersoY() {
        yoshi = new ImageView("Asset/Image/yoshi.gif");
        yoshi.setX(180);
        yoshi.setY(530);
        yoshi.setScaleX(0.3);
        yoshi.setScaleY(0.3);
    }

    void setVuePersoY(){
        root.getChildren().clear();
        root.getChildren().addAll(fond);
        root.getChildren().add(yoshi);
        //root.getChildren().add(Retour);
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


package View;

import Controller.ControllerMenu;
import Tool.Path;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewOptions {
    private Group root;
    private Text texteM, texteY, RetourOptions;
    private ImageView yoshi;
    private ImageView mario2;
    private Button options;

    ViewOptions(Group root) {
        this.root = root;
        initTexte();
        initPerso2();
        initPerso3();
    }

    private void initPerso2(){
        yoshi = new ImageView("Asset/Image/yoshi.gif");
        yoshi.setX(200);
        yoshi.setY(450);
        yoshi.setScaleX(0.5);
        yoshi.setScaleY(0.5);
    }
    private void initPerso3(){
        mario2 = new ImageView("Asset/Image/mario.gif");
        mario2.setX(600);
        mario2.setY(500);
        mario2.setScaleX(0.6);
        mario2.setScaleY(0.6);

    }
    private void initTexte(){
        texteM = new Text("MARIO");
        texteY = new Text("YOSHI");
        RetourOptions = new Text("Retour");
        Font police = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase),40);
        texteM.setFont(police);
        texteM.setFill(Color.RED);
        texteM.setX(750);
        texteM.setY(750);
        texteY.setX(350);
        texteY.setY(750);
        texteY.setFont(police);
        texteY.setFill(Color.GREEN);
        RetourOptions.setX(1000);
        RetourOptions.setY(200);
        RetourOptions.setFont(police);
        RetourOptions.setFill(Color.WHITE);
        //RetourOptions.setOnMouseClicked(event -> primaryStage.setScene(scene));
    }

    public void setEvents(ControllerMenu cm){ RetourOptions.setOnMouseClicked(cm);}

    void setVueOptions() {
        root.getChildren().clear();
        root.getChildren().add(yoshi);
        root.getChildren().add(mario2);
        root.getChildren().add(texteM);
        root.getChildren().add(texteY);
        root.getChildren().add(RetourOptions);
    }


    public Text getRetour(){
        return RetourOptions;
    }
}




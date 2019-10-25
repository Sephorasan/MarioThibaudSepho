package View;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ViewOptions {
    private Group root3;
    private Text texteM, texteY, RetourOptions;
    private ImageView yoshi;
    private ImageView mario2;

    ViewOptions(Group root) {
        this.root3 = root3;
        //initText();
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
        /*
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

        RetourOptions.setText("Retour");
        RetourOptions.setX(1000);
        RetourOptions.setY(200);
        Font policeTitreRO = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        RetourOptions.setFont(policeTitreRO);
        RetourOptions.setFill(Color.WHITE);
        RetourOptions.setOnMouseClicked(event -> primaryStage.setScene(scene));

    }
}*/
    }
    void setVueOptions() {
        root3.getChildren().add(yoshi);
        root3.getChildren().add(mario2);
        root3.getChildren().add(texteM);
        root3.getChildren().add(texteY);
        root3.getChildren().add(RetourOptions);
    }

}




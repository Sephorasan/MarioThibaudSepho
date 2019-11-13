package View;

import Controller.ControllerMenu;
import Controller.ControllerOptions;
import Music.Music;
import Tool.Path;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewOptions {
    private Group root;
    private Text texteM, texteY, RetourOptions, texteK;
    private ImageView yoshi;
    private ImageView fond;
    private ImageView mario2;
    private ImageView kirby;
    private Slider musicSlider;
    private Text volumeLabel;


    ViewOptions(Group root) {
        this.root = root;
        initTexte();
        initPerso2();
        initPerso3();
        initPerso4();
        initBackground();
        Volume();
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
    private void initPerso4(){
        kirby = new ImageView("Asset/Image/kirby.gif");
        kirby.setX(900);
        kirby.setY(550);
        kirby.setScaleX(0.5);
        kirby.setScaleY(0.5);

    }
    private void initTexte(){
        volumeLabel = new Text("Vol: ");
        texteM = new Text("MARIO");
        texteY = new Text("YOSHI");
        texteK = new Text("KIRBY");
        RetourOptions = new Text("Retour");
        Font police = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase),40);
        texteM.setFont(police);
        texteM.setFill(Color.RED);
        texteM.setX(650);
        texteM.setY(750);
        texteY.setX(360);
        texteY.setY(750);
        texteY.setFont(police);
        texteY.setFill(Color.GREEN);
        texteK.setFont(police);
        texteK.setFill(Color.PINK);
        texteK.setX(950);
        texteK.setY(750);
        RetourOptions.setX(1000);
        RetourOptions.setY(200);
        RetourOptions.setFont(police);
        RetourOptions.setFill(Color.BLACK);
        volumeLabel.setFont(police);
        volumeLabel.setX(420);
        volumeLabel.setY(320);
    }

    private void initBackground(){
        fond = new ImageView("Asset/Image/fond-mario-option.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond.setFitHeight((int) primaryScreenBounds.getHeight());
        fond.setFitWidth((int) primaryScreenBounds.getWidth());
    }
    private void Volume(){
        musicSlider = new Slider(0, 100, 100);
        musicSlider.setBlockIncrement(10);
        musicSlider.setShowTickLabels(true);
        musicSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> Music.setVolume(newValue.intValue() / 100.));
        musicSlider.setLayoutX(420);
        musicSlider.setLayoutY(350);
    }

    void setVueOptions() {
        root.getChildren().clear();
        root.getChildren().add(fond);
        root.getChildren().add(yoshi);
        root.getChildren().add(mario2);
        root.getChildren().add(texteM);
        root.getChildren().add(texteY);
        root.getChildren().add(kirby);
        root.getChildren().add(texteK);
        root.getChildren().add(RetourOptions);
        root.getChildren().add(volumeLabel);
        root.getChildren().add(musicSlider);
        root.getStylesheets().add(getClass().getResource("../Asset/Css/slider.css").toExternalForm());
    }

    public Text getRetour(){
        return RetourOptions;
    }

    public Text getPersoY(){ return texteY;}

    public Text getPersoM(){ return texteM;}

    public Text getPersoK(){ return texteK;}

    void setEvents(ControllerMenu cm){
        RetourOptions.setOnMouseClicked(cm);
    }
    void setEvents(ControllerOptions co){
        texteY.setOnMouseClicked(co);
        texteM.setOnMouseClicked(co);
        texteK.setOnMouseClicked(co);
    }

}




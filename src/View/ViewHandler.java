package View;

import Controller.ControllerJeu;
import Controller.ControllerMenu;
import Controller.ControllerOptions;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.File;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewHandler vh;
    private ViewJeu vj;
    private ViewOptions vo;
    private ViewMenu vm;
    private ViewPersoY vy;
    private ControllerOptions ControllerOptions;
    private ControllerMenu ControllerMenu;
    private ControllerJeu ControllerJeu;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MARIO");
        Group root = new Group();
        Scene scene = new Scene(root);

        vj = new ViewJeu(root);
        vm = new ViewMenu(root);
        vo = new ViewOptions(root);
        vy = new ViewPersoY(root);


        ControllerMenu = new ControllerMenu(this);
        ControllerJeu = new ControllerJeu(this);
        ControllerOptions = new ControllerOptions(this);

        final File file = new File("src/Asset/Son/mario-theme.mp3");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);

        afficherMenuPrincipal();
        primaryStage.setTitle("Mario");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        mediaPlayer.play();
        primaryStage.show();
    }

    public void afficherMenuPrincipal() {
        vm.setVueMenu();
    }

    public void afficherViewOptions() {
        vo.setVueOptions();
    }

    public void afficherViewJeu() {
        vj.setVueJeu();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ViewOptions getVo() {
        return vo;
    }

    public ViewJeu getVj(){
        return vj;
    }
    public ViewMenu getVm() {
        return vm;
    }

    public ViewPersoY getVy(){
        return vy;
    }

    public void setVueJeu(){
        vj.setVueJeu();
    }
    public void setVuePersoY(){
        vy.setVuePersoY();
    }
    public void setVueOptions(){
        vo.setVueOptions();
    }
    public void setVueMenu(){
        vm.setVueMenu();
    }
    public void setEventHandlerMenu(ControllerMenu controllerMenu) {
        vm.setEvents(controllerMenu);
        vo.setEvents(controllerMenu);
    }

    public void setEventHandlerOptions(ControllerOptions controllerOptions){
        vo.setEvents(controllerOptions);
    }


}

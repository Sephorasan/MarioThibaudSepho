package View;

import Controller.ControllerJeu;
import Controller.ControllerMenu;
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
    private ControllerMenu ControllerMenu;
    private ControllerJeu ControllerJeu;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MARIO");
        Group root = new Group();
        Scene scene = new Scene(root);

        vm = new ViewMenu(root);
        vo = new ViewOptions(root);

        ControllerMenu = new ControllerMenu(this);
        ControllerJeu = new ControllerJeu(this);

        final File file = new File("src/Asset/Son/mario-theme.mp3");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);

        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mario");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        mediaPlayer.play();
    }
        public void afficherMenuPrincipal(){
            vm.setVueMenu();
        }

    public void afficherViewOptions() { vo.setVueOptions(); }
    public void afficherViewJeu(){
        vj.setVueJeu();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public ViewMenu getVm() {
        return vm;
    }
    public ViewOptions getVo() { return vo; }



}

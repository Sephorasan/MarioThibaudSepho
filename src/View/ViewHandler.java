package View;

import Controller.ControllerClavierJeu;
import Controller.ControllerJeu;
import Controller.ControllerMenu;
import Controller.ControllerOptions;
import Music.Music;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewHandler vh;
    private ViewJeu vj;
    private ViewOptions vo;
    private ViewMenu vm;
    private ViewPersoY vpy;
    private ViewPersoM vpm;
    private ViewPersoK vpk;
    private ControllerOptions ControllerOptions;
    private ControllerMenu ControllerMenu;
    private ControllerJeu ControllerJeu;
    private ControllerClavierJeu controllerClavierJeu;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("MARIO");
        Group root = new Group();
        Scene scene = new Scene(root);

        vj = new ViewJeu(root);
        vm = new ViewMenu(root);
        vo = new ViewOptions(root);
        vpm = new ViewPersoM(root);
        vpy = new ViewPersoY(root);
        vpk = new ViewPersoK(root);


        ControllerMenu = new ControllerMenu(this);
        ControllerJeu = new ControllerJeu(this);
        ControllerOptions = new ControllerOptions(this);

        ControllerClavierJeu controllerClavierJeu = new ControllerClavierJeu(this, vj);
        scene.setOnKeyPressed(controllerClavierJeu);
        scene.setOnKeyReleased(controllerClavierJeu);


        afficherMenuPrincipal(true);
        primaryStage.setTitle("Mario");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
    ////////////////////////////////////////////////////////
    public void afficherMenuPrincipal(Boolean reloadMusic) {
        vm.setVueMenu();
        if(reloadMusic) Music.startMainMenuMusic();
    }
    ////////////////////////////////////////////////////////
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
    public ViewPersoY getVpy(){
        return vpy;
    }
    ////////////////////////////////////////////////////////
    public void setVueJeu(){
        vj.setVueJeu();
    }
    public void setVuePersoY(){
        vpy.setVuePersoY();
    }
    public void setVuePersoM(){
        vpm.setVuePersoM();}
    public void setVuePersoK(){
        vpk.setVuePersoK();}
    public void setVueOptions(){
        vo.setVueOptions();
    }
    public void setVueMenu(){
        vm.setVueMenu();
    }
    ////////////////////////////////////////////////////////
    public void setEventHandlerMenu(ControllerMenu controllerMenu) {
        vm.setEvents(controllerMenu);
        vo.setEvents(controllerMenu);
    }
    public void setEventHandlerOptions(ControllerOptions controllerOptions){
        vo.setEvents(controllerOptions);
    }
    public void setEventHandlerJeu(ControllerJeu controllerJeu){
        vj.setEvents(controllerJeu);
    }
}

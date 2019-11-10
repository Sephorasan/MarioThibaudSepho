package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerMenu implements EventHandler<MouseEvent> {
    private ViewHandler launcher;

    public ControllerMenu(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerMenu(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVm().getLancerJeu())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueJeu();
        } else if (event.getSource().equals(launcher.getVo().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
            launcher.setVueMenu();
        } else if (event.getSource().equals(launcher.getVm().getQuitter())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.getPrimaryStage().close();
        } else if (event.getSource().equals(launcher.getVm().getOptions())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
            launcher.setVueOptions();
        }
    }
}

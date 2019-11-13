package Controller;

import View.ViewHandler;
import View.ViewPersoK;
import View.ViewPersoM;
import View.ViewPersoY;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerJeu implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ViewPersoY viewPersoY;
    private ViewPersoM viewPersoM;
    private ViewPersoK viewPersoK;

    public ControllerJeu(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerJeu(this);
        this.viewPersoY = viewPersoY;
        this.viewPersoM = viewPersoM;
        this.viewPersoK = viewPersoK;

    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVj().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueMenu();
        } else if (event.getSource().equals(launcher.getVpy().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueMenu();
        } else if (event.getSource().equals(launcher.getVpm().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueMenu();
        } else if (event.getSource().equals(launcher.getVpk().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueMenu();
        }
    }
}

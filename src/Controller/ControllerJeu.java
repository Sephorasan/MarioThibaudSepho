package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerJeu implements EventHandler<MouseEvent> {
    private ViewHandler launcher;

    public ControllerJeu(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerJeu(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVj().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueMenu();

        }
    }
}

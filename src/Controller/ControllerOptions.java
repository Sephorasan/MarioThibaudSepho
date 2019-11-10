package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerOptions implements EventHandler<MouseEvent> {
    private ViewHandler launcher;

    public ControllerOptions(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerOptions(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVo().getPersoY())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVuePersoY();
        } else if (event.getSource().equals(launcher.getVo().getRetour())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
            launcher.setVueOptions();
    }
    }
}

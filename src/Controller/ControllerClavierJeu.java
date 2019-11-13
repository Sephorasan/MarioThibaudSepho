package Controller;

import View.ViewHandler;
import View.ViewJeu;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControllerClavierJeu implements EventHandler<KeyEvent> {

    private ViewHandler viewHandler;
    private ViewJeu viewJeu;



    public ControllerClavierJeu(ViewHandler viewHandler, ViewJeu viewJeu) {

        this.viewHandler = viewHandler;
        this.viewJeu = viewJeu;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {

                viewJeu.moveLeft();
            } else if (event.getCode() == KeyCode.RIGHT) {

                viewJeu.moveRight();

            } else if (event.getCode() == KeyCode.SPACE) {

            }
        }
    }



}

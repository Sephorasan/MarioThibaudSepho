package Controller;

import View.*;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControllerClavierJeu implements EventHandler<KeyEvent> {

    private ViewHandler viewHandler;
    private ViewJeu viewJeu;
    private ViewPersoY viewPersoY;
    private ViewPersoM viewPersoM;
    private ViewPersoK viewPersoK;

    public ControllerClavierJeu(ViewHandler viewHandler, ViewJeu viewJeu, ViewPersoY viewPersoY,ViewPersoM viewPersoM, ViewPersoK viewPersoK) {

        this.viewHandler = viewHandler;
        this.viewJeu = viewJeu;
        this.viewPersoY = viewPersoY;
        this.viewPersoM = viewPersoM;
        this.viewPersoK = viewPersoK;
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {

                viewJeu.moveLeft();
                viewPersoY.moveLeft();
                viewPersoM.moveLeft();
                viewPersoK.moveLeft();
            } else if (event.getCode() == KeyCode.RIGHT) {

                viewJeu.moveRight();
                viewPersoY.moveRight();
                viewPersoM.moveRight();
                viewPersoK.moveRight();

            } else if (event.getCode() == KeyCode.SPACE) {

                viewJeu.jump();
            }
        }
    }
}

package Controller;

import Animation.JeuTimeLine;
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

    private BooleanProperty leftKeyTyped, rightKeyTyped, spaceBarKeyTyped;

    public ControllerClavierJeu(ViewHandler viewHandler, ViewJeu controllerJeu) {
        leftKeyTyped = new SimpleBooleanProperty(false);
        rightKeyTyped = new SimpleBooleanProperty(false);
        spaceBarKeyTyped = new SimpleBooleanProperty(false);
        this.viewHandler = viewHandler;
        this.viewJeu = viewJeu;
        JeuTimeLine jeuTimeLine = new JeuTimeLine(this);
        //JeuTimeLine.start();
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {
                leftKeyTyped.set(true);
            } else if (event.getCode() == KeyCode.RIGHT) {
                rightKeyTyped.set(true);
            } else if (event.getCode() == KeyCode.SPACE) {
                spaceBarKeyTyped.set(true);
            }
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
            if (event.getCode() == KeyCode.LEFT) {
                leftKeyTyped.set(false);
            } else if (event.getCode() == KeyCode.RIGHT) {
                rightKeyTyped.set(false);
            } else if (event.getCode() == KeyCode.SPACE) {
                spaceBarKeyTyped.set(false);
            }
        }
    }

    public synchronized void moveLeft() {
        viewJeu.moveLeft();
    }

    public synchronized void moveRight() {
        viewJeu.moveRight();
    }

    public synchronized boolean isLeftKeyTyped() {
        return leftKeyTyped.get();
    }

    public synchronized boolean isRightKeyTyped() {
        return rightKeyTyped.get();
    }

    public synchronized boolean isSpaceBarKeyTyped() {
        return spaceBarKeyTyped.get();
    }

}

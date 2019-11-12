package Animation;

import Controller.ControllerClavierJeu;
import javafx.animation.AnimationTimer;

public class JeuTimeLine extends AnimationTimer {

    private ControllerClavierJeu controllerClavierJeu;

    public JeuTimeLine(ControllerClavierJeu controllerClavierJeu) {
        this.controllerClavierJeu = controllerClavierJeu;
    }

    @Override
    public void handle(long now) {
            if (controllerClavierJeu.isLeftKeyTyped()) {
                controllerClavierJeu.moveLeft();
            } else if (controllerClavierJeu.isRightKeyTyped()) {
                controllerClavierJeu.moveRight();
            }
    }
}

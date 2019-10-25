package View;

import Tool.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ViewMenu{
    private Group root;
    private Scene scene, scene2, scene3;
    private ImageView fond1;
    private Text texte, Jouer, Options, Quitter;

    ViewMenu(Group root) {
        this.root = root;
        initBackground();
        initTexte();
    }

    private void initTexte(){
        /*
        texte.setText("MARIO DEMINEUR");
        texte.setX(350);
        texte.setY(250);
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 70);
        texte.setFont(policeTitre);
        texte.setFill(Color.RED);

        Jouer.setText("Jouer");
        Jouer.setX(700);
        Jouer.setY(450);
        Font policeTitreJ = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Jouer.setFont(policeTitreJ);
        Jouer.setFill(Color.WHITE);
        Jouer.setOnMouseClicked(event -> primaryStage.setScene(scene2));

        Options.setText("Options");
        Options.setX(700);
        Options.setY(500);
        Font policeTitreO = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Options.setFont(policeTitreO);
        Options.setFill(Color.WHITE);
        Options.setOnMouseClicked(event -> primaryStage.setScene(scene3));

        Quitter.setText("Quitter");
        Quitter.setX(700);
        Quitter.setY(550);
        Font policeTitreQ = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        Quitter.setFont(policeTitreQ);
        Quitter.setFill(Color.WHITE);
        Quitter.setOnMouseClicked(event -> primaryStage.close());
*/

    }
        private void initBackground(){
        fond1 = new ImageView("Asset/Image/fond3.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        fond1.setFitHeight((int) primaryScreenBounds.getHeight());
        fond1.setFitWidth((int) primaryScreenBounds.getWidth());
    }
    void setVueMenu() {
        root.getChildren().addAll(fond1);
        root.getChildren().add(texte);
        root.getChildren().add(Jouer);
        root.getChildren().add(Options);
        root.getChildren().add(Quitter);
    }

}

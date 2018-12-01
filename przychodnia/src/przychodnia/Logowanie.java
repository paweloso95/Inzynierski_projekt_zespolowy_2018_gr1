package przychodnia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 *
 * @author Bartek
 */
public class Logowanie extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Logowanie");
       
        //nrP Label - constrains use (child, column, row)
        Label nrPLabel = new Label("PESEL:");
        GridPane.setConstraints(nrPLabel, 0, 1);

        //nrP Input
        TextField nrPInput = new TextField();
        GridPane.setConstraints(nrPInput, 1, 1);

        //Password Label
        Label passLabel = new Label("Hasło:");
        GridPane.setConstraints(passLabel, 0, 2);

        //Password Input
        PasswordField passInput = new PasswordField ();
        //passInput.setPromptText("Hasło");
        GridPane.setConstraints(passInput, 1, 2);

        //button
        Button button = new Button("Zaloguj się");
        GridPane.setConstraints(button, 1, 3);

        Label logLabel = new Label("Nie masz konta?");
        Hyperlink hyperlink = new Hyperlink("Zarejestruj się!");
        GridPane.setConstraints(logLabel, 0, 4);
        GridPane.setConstraints(hyperlink, 1, 4);

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 25));
        grid.setVgap(8);
        grid.setHgap(10);
        
        grid.getChildren().addAll(nrPLabel, nrPInput, passLabel, passInput, button, logLabel, hyperlink);
                
        scene = new Scene(grid, 300, 150);
        window.setScene(scene);
        window.show();
    }
    private void printMovie(){
        System.out.println(comboBox.getValue());
    }    
}

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        //System.out.println("Hello");
        laubch(args);
    }
    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Grid Bingo!!");
        
        button = new Button();
        button.setText("Start");

        StackPane layout = new StackPane();
        layout.getChrildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
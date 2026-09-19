import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonClickExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Press the button");
        Button button = new Button("Click me!");

        // Set an event handler for the button click
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
    
// ActionEvent is an object that contains information about the click .
                label.setText("Button Clicked!");
            }
        });



        // Arrange controls vertically
        VBox root = new VBox(10); 
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 250, 150);
        primaryStage.setTitle("Button Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

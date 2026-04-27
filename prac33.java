 import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;

public class prac33 extends Application {
    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(15); // spacing = 15
        vbox.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            // Font: Times New Roman, Bold + Italic, 22
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            // Random color
            text.setFill(Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble()
            ));

            // Random opacity between 0.3 and 1.0
            text.setOpacity(0.3 + (0.7 * random.nextDouble()));

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("JavaFX Text Styling");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class prac35 extends Application {

    @Override
    public void start(Stage stage) {

        // Scale factor for height
        int scale = 3; // 1% = 3 pixels

        // Create bars
        VBox projects = createBar("Projects — 20%", 20 * scale, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 10 * scale, Color.BLUE);
        VBox midterm = createBar("Midterm Exams — 30%", 30 * scale, Color.GREEN);
        VBox finals = createBar("Final Exam — 40%", 40 * scale, Color.ORANGE);

        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projects, quizzes, midterm, finals);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int height, Color color) {
        Rectangle rect = new Rectangle(60, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(rect, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

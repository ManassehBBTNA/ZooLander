/**
 * Created by Manasseh on 25/12/2017.
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2, scene3;

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception {
        window = primaryStage;


        //Button 1&4
        Label label1 = new Label ("Animals at ZooLander Zoo");
        Button button1 = new Button ("Pens");
        Button button4 = new Button ("Keepers");
        button4.setOnAction(e ->window.setScene(scene3));
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1, button4);
        scene1 = new Scene (layout1, 600, 300);

        //Button 2
        Button button2 = new Button ("Keepers");
        button2.setOnAction(e -> window.setScene(scene3));

        //Layout 2
        Label label2 = new Label ("Pens at ZooLander Zoo");
        HBox layout2 = new HBox(300);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 600, 300);

        //Button 3
        Button button3 = new Button ("Back to Pens");
        button3.setOnAction(e -> window.setScene(scene1));

        //Layout 3
        Label label3 = new Label ("Keepers and ZooLander Zoo");
        HBox layout3 = new HBox(300);
        layout3.getChildren().addAll(label3, button3);
        scene3 = new Scene(layout3, 600, 300);

        window.setScene(scene1);
        window.setTitle("ZooLander Zoo");
        window.show();

    }
}

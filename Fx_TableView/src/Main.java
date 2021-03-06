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
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.Group;

import java.awt.*;

import static javafx.geometry.Pos.BOTTOM_LEFT;

public class Main extends Application {

    Stage window;

    //Scene scene1, scene2, scene3;


    public static void main (String[] args) {
        launch(args);


    }

    @Override
    public void start (Stage primaryStage) throws Exception {
        window = primaryStage;




        //Button 1&2 &3 FXMLLoader.load(getClass().getResource(
        //Label label1 = new Label ("picture from 2016.Zoolander 2. [poster] Available at:<http://www.imdb.com/title/tt1608290/mediaviewer/rm243851520> [Accessed 5 February 2018 ]");
        Button button1 = new Button ("Animal Infomation");
        Button button2 = new Button ("Keepers Information");
        Button button3 = new Button ("Pens Information");
        Button button4 = new Button ("The Zoo");
        AnimalScene animalScene = new AnimalScene ();

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //System.out.println("Animal");
               try {
                   Stage s = new Stage();
                   AnimalScene a = new AnimalScene();
                   a.start(s);
               }catch(Exception e){

               }
                //setLoggedInUser(textUser.getText());
               //stage.close(); // return to main window
           }
       });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //System.out.println("Animal");
                try {
                    Stage s2 = new Stage();
                    KeeperScene c = new KeeperScene();
                    c.start(s2);
                }catch(Exception e){

                }
                //setLoggedInUser(textUser.getText());
                //stage.close(); // return to main window
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //System.out.println("Animal");
                try {
                    Stage s3 = new Stage();
                    PenScene c = new PenScene();
                    c.start(s3);
                }catch(Exception e){

                }
                //setLoggedInUser(textUser.getText());
                //stage.close(); // return to main window
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                //System.out.println("Animal");
                try {
                    Stage s4 = new Stage();
                    ZooScene d = new ZooScene();
                    d.start(s4);
                }catch(Exception e){

                }
                //setLoggedInUser(textUser.getText());
                //stage.close(); // return to main window
            }
        });



        //button3.setOnAction(e ->window.setScene(animalScene));
        //button2.setOnAction(e ->window.setScene(scene3));
        //button1.setOnAction(e -> window.setScene(scene2));

        /*Group root = new Group();
        /*Scene scene = new Scene(root);
        /*scene.setFill(Color.BLACK);

        // load the image
        javafx.scene.image.Image image = new javafx.scene.image.Image("Zoolander3.jpg");

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        BorderPane border = new BorderPane();
        HBox box1 = new HBox();
        box1.getChildren().addAll(iv1);
        //box1.setPadding(new Insets(20, 20, 20, 20));
        VBox layout1 = new VBox(20, button1, button2, button3);
        root.getChildren().add(box1);
        //AnchorPane anchorpane = new AnchorPane();
        //anchorpane.getChildren().addAll(box2, label1); // Add grid from Example 1-5
        //AnchorPane.setBottomAnchor(box2, 8.0);*/

        // load the image
        javafx.scene.image.Image image = new javafx.scene.image.Image("Zoolander3.jpg");

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        Group root = new Group();
        Scene scene1 = new Scene(root);

        HBox box = new HBox();
        box.getChildren().addAll(iv1);

        Weather Current = new Weather ();
        Label City = new Label ("City" + Current.getCity());
        City.setTextFill(Color.BLUE);

        Label Description = new Label (Current.getDescription());
        Description.setTextFill(Color.SNOW);

        Label Temperature = new Label ("Temperature" + Current.getTemperature());
        Temperature.setTextFill(Color.SNOW);

        //Label Sun = new Label ("Sunshine" + Current.getSun());
        //Sun.setTextFill(Color.DARKGREEN);

        Label Clouds = new Label ("Clouds" + Current.getClouds());
        Clouds.setTextFill(Color.DARKGREEN);

        Label Humidity = new Label ("Humidity" + Current.getHumidity());
        Humidity.setTextFill(Color.DARKGREEN);

        Label LastUpdate = new Label ("Last weather update" + Current.getLastUpdate());
        LastUpdate.setTextFill(Color.SNOW);




        VBox box2 = new VBox();
        box2.getChildren().addAll(button1, button2, button3, button4, LastUpdate, City,  Description, Temperature, Humidity, Clouds);
        box2.setPadding(new Insets (5, 5, 5, 5));
        HBox box3 = new HBox(8);
        //box3.getChildren().add(label1);



        root.getChildren().addAll(box, box2, box3);







        window.setWidth(400);
        window.setHeight(500);
        window.setScene(scene1);
        window.sizeToScene();
        window.show();





        window.setScene(scene1);
        window.setTitle("Welcome to ZooLander Zoo- The World's no. 1 Internet Famous Zoo for really, really, really good looking Animals! ");
        window.show();



    }


}
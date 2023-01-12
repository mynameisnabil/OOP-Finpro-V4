import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.ListData;
import model.ListDataUser;

public class App extends Application{
    private double xOffset = 0;
    private double yOffset = 0;


    public void setInitialValue() {
        ListDataUser.addUser("admin", "admin", "admin");
        ListDataUser.addUser("hadad", "hadad", "customer");

        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);

    }


    

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        setInitialValue();

        Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // grab your root here
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        // move around here
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });
        Scene scene = new Scene(root);
        // set transparent
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);

        primaryStage.show();
        
    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }
}

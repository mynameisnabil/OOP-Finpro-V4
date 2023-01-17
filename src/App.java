import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.ListData;
import model.ListDataTransaksi;
import model.ListDataUser;

public class App extends Application{
    private double xOffset = 0;
    private double yOffset = 0;


    public void setInitialValue() {
        ListDataUser.addUser("admin", "admin", "admin");
        ListDataUser.addUser("hadad", "hadad", "customer");

        ListData.addCar("Avanza", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Innova", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Xenia", "Daihatsu", "MPV", 10, 10000);
        ListData.addCar("Alphard", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Vellfire", "Toyota", "MPV", 10, 10000);
        ListData.addCar("Fortuner", "Toyota", "SUV", 10, 10000);
        ListData.addCar("Pajero", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Xpander", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Xpander Cross", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Pajero Sport", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Outlander", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Eclipse Cross", "Mitsubishi", "SUV", 10, 10000);
        ListData.addCar("Civic", "Honda", "Sedan", 10, 10000);


        ListDataTransaksi.addTrans("Joy","Civic","Honda","Sedan",10000);
        ListDataTransaksi.addTrans("Naufal","Innova","Toyota","Sedan",10000);
        ListDataTransaksi.addTrans("Nabil","Alphard","Toyota","Sedan",10000);
        ListDataTransaksi.addTrans("Farid","Velfire","Toyota","Sedan",10000);
        ListDataTransaksi.addTrans("Hadad","Fortuner","Toyota","Sedan",10000);
        ListDataTransaksi.addTrans("Jodik","Civic","Honda","Sedan",10000);
        ListDataTransaksi.addTrans("Rey","Civic","Honda","Sedan",10000);
        ListDataTransaksi.addTrans("Jeje","Civic","Honda","Sedan",10000);
    
    
    
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

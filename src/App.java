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

        ListData.addCar("Altis", "Toyota", "Luxury Car", 10, 10000);
        ListData.addCar("Innova", "Toyota", "Luxury Car", 10, 10000);
        ListData.addCar("Toyota 86", "Toyota", "Luxury Car", 10, 10000);
        ListData.addCar("Alphard", "Toyota", "Luxury Car", 10, 10000);
        ListData.addCar("Vellfire", "Toyota", "Luxury Car", 10, 10000);
        ListData.addCar("Pajero", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Xpander", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Xpander Cross", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Pajero Sport", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Outlander", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Eclipse Cross", "Mitsubishi", "Luxury Car", 10, 10000);
        ListData.addCar("Civic", "Honda", "Luxury Car", 10, 10000);


        ListDataTransaksi.addTrans("Joy","Civic","Honda","Luxury Car",10000);
        ListDataTransaksi.addTrans("Naufal","Innova","Toyota","Luxury Car",10000);
        ListDataTransaksi.addTrans("Nabil","Alphard","Toyota","Luxury Car",10000);
        ListDataTransaksi.addTrans("Farid","Velfire","Toyota","Luxury Car",10000);
        ListDataTransaksi.addTrans("Hadad","Fortuner","Toyota","Luxury Car",10000);
        ListDataTransaksi.addTrans("Jodik","Civic","Honda","Luxury Car",10000);
        ListDataTransaksi.addTrans("Rey","Civic","Honda","Luxury Car",10000);
        ListDataTransaksi.addTrans("Jeje","Civic","Honda","Luxury Car",10000);
    
    
    
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

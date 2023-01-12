package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class PageStrukController implements Initializable {
    public static int idMobil;
    public static String NamaMobil;
    public static String merek;
    public static int priceCar;
    public static int qtyCar;
    public static int amountCar;

    @FXML
    private Label lblIdTrans;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblPrice;

    @FXML
    private Label lblQty;

    @FXML
    private Label lblAmount;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private Button btnBack;

    
    public void initialize(URL location, ResourceBundle resources) {
        lblTitle.setText(NamaMobil);
        lblPrice.setText(Integer.toString(priceCar));
        lblQty.setText(Integer.toString(qtyCar));
        lblAmount.setText(Integer.toString(amountCar));
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnBack) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/userPage.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }

        } 
    }


}

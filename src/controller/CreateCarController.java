package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.ListData;

public class CreateCarController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnCreate;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField IdtxtNamaMobil;

    @FXML
    private TextField IdtxtMerek;

    @FXML
    private TextField IdtxtStock;

    @FXML
    private TextField IdtxtHarga;

    @FXML
    private TextField IdtxtType;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/ListMobil.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCreate) {
            try {
                String namaMobil = IdtxtNamaMobil.getText();
                String merek = IdtxtMerek.getText();
                int stock = Integer.parseInt(IdtxtStock.getText());
                int price = Integer.parseInt(IdtxtHarga.getText());
                String type = IdtxtType.getText();

                ListData.addCar(namaMobil, merek, type, stock, price);
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/ListMobil.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

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
import model.ListDataTransaksi;

public class CreateTransaksiController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnCreate;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField IdtxtNamaCustomer;

    @FXML
    private TextField IdtxtNamaMobil;

    @FXML
    private TextField IdtxtNamaMerek;

    @FXML
    private TextField IdtxtType;

    @FXML
    private TextField IdtxtPrice;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnCancel) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Dashboard.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnCreate) {
            try {
                String namaCustomer = IdtxtNamaCustomer.getText();
                String namaMobil = IdtxtNamaMobil.getText();
                String Merek = IdtxtNamaMerek.getText();
                String type = IdtxtType.getText();
                Integer price = Integer.parseInt(IdtxtPrice.getText());

                ListDataTransaksi.addTrans(namaCustomer, namaMobil, Merek, type, price);
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Dashboard.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

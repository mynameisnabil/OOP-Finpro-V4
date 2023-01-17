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

public class EditTransaksiController implements Initializable{

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField IdtxtNamaCustomerEdit;

    @FXML
    private TextField IdtxtNamaMobilEdit;

    @FXML
    private TextField IdtxtMerekEdit;

    @FXML 
    private TextField IdtxttypeEdit;

    @FXML
    private TextField IdtxtPriceEdit;

   

    public static int idTransaksiEdit;

    public void initialize(URL location, ResourceBundle resources) {
        IdtxtNamaCustomerEdit.setText(ListDataTransaksi.getNamaCustomer(idTransaksiEdit));
        IdtxtNamaMobilEdit.setText(ListDataTransaksi.getNamaMobil(idTransaksiEdit));
        IdtxtMerekEdit.setText(ListDataTransaksi.getMerek(idTransaksiEdit));
        IdtxttypeEdit.setText(ListDataTransaksi.getType(idTransaksiEdit));
        IdtxtPriceEdit.setText(String.valueOf(ListDataTransaksi.getPrice(idTransaksiEdit)));
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
                e.printStackTrace();
            }
        } else if (event.getSource() == btnSave) {
            try {
                ListDataTransaksi.setNamaCustomer(idTransaksiEdit, IdtxtNamaCustomerEdit.getText());
                ListDataTransaksi.setNamaMobil(idTransaksiEdit, IdtxtNamaMobilEdit.getText());
                ListDataTransaksi.setMerek(idTransaksiEdit, IdtxtMerekEdit.getText());
                ListDataTransaksi.setType(idTransaksiEdit, IdtxttypeEdit.getText());
                ListDataTransaksi.setprice(idTransaksiEdit, Integer.parseInt(IdtxtPriceEdit.getText()));

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
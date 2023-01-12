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

public class EditCarController implements Initializable {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField IdtxtNameCarEdit;

    @FXML
    private TextField IdtxtMerekEdit;

    @FXML
    private TextField IdtxtStokEdit;

    @FXML
    private TextField IdtxtPriceEdit;

    @FXML
    private TextField IdtxtTypeEdit;

    public static int idCarEdit;

    public void initialize(URL location, ResourceBundle resources) {
        IdtxtNameCarEdit.setText(ListData.getNamaMobil(idCarEdit));
        IdtxtMerekEdit.setText(ListData.getMerek(idCarEdit));
        IdtxtStokEdit.setText(String.valueOf(ListData.getStock(idCarEdit)));
        IdtxtPriceEdit.setText(String.valueOf(ListData.getPrice(idCarEdit)));
        IdtxtTypeEdit.setText(ListData.getType(idCarEdit));
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
        } else if (event.getSource() == btnSave) {
            try {

                ListData.setNamaMobil(idCarEdit, IdtxtNameCarEdit.getText());
                ListData.setMerek(idCarEdit, IdtxtMerekEdit.getText());
                ListData.setStock(idCarEdit, Integer.parseInt(IdtxtStokEdit.getText()));
                ListData.setPrice(idCarEdit, Integer.parseInt(IdtxtPriceEdit.getText()));
                ListData.setType(idCarEdit, IdtxtTypeEdit.getText());
                
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/ListMobil.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {

                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

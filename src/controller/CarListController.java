package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import model.ListData;

public class CarListController implements Initializable {
    @FXML
    private VBox pnItemsCar = null;

    @FXML
    private Label IdMobil;

    @FXML
    private Label NameMobil;

    @FXML
    private Label MerekMobil;

    @FXML
    private Label TypeMobil;

    @FXML
    private Label StokMobil;

    @FXML
    private Label CarPrice;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnTransaksi;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private TextField fieldId;

    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ListData.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../view/itemList.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #A9A9A9");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : WHITE");
                });

                // set the data to the labels
                IdMobil = (Label) nodes[i].lookup("#IdMobil");
                IdMobil.setText((i + 1) + "");

                NameMobil = (Label) nodes[i].lookup("#NameMobil");
                NameMobil.setText(ListData.getNamaMobil(i));

                MerekMobil = (Label) nodes[i].lookup("#MerekMobil");
                MerekMobil.setText(ListData.getMerek(i));

                TypeMobil = (Label) nodes[i].lookup("#TypeMobil");
                TypeMobil.setText(ListData.getType(i));

                StokMobil = (Label) nodes[i].lookup("#StokMobil");
                StokMobil.setText(ListData.getStock(i) + "");

                CarPrice = (Label) nodes[i].lookup("#CarPrice");
                CarPrice.setText(ListData.getPrice(i) + "");

                pnItemsCar.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (event.getSource() == btnEdit) {

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/EditCar.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (event.getSource() == btnCreate) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/CreateCar.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (event.getSource() == btnDelete) {
            try {
                ListData.deleteCar(Integer.parseInt(fieldId.getText())-1);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/CarList.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if (event.getSource() == btnTransaksi) {
            try {
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

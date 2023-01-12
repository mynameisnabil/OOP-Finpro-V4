package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.ListData;

public class DashboardController implements Initializable{

    private ArrayList<String> nameMobil;

    @FXML
    private VBox pnItems = null;


    @FXML
    private Label NameMobil;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameMobil = new ArrayList<>();
        nameMobil.add("Contoh 1");
        nameMobil.add("Contoh 2");
        nameMobil.add("Contoh 3");
        nameMobil.add("Contoh 4");

        Node[] nodes = new Node[5];
        for (int i = 0; i < nameMobil.size(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../view/TransactionList.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });

                // set the data to the labels
                NameMobil = (Label) nodes[i].lookup("#NameMobil");
                NameMobil.setText(nameMobil.get(i));

                pnItems.getChildren().add(nodes[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        }
}

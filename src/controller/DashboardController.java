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
import model.ListDataTransaksi;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class DashboardController implements Initializable{

    @FXML
    private TextField inputText;

    @FXML
    private Label IdMobil;

    @FXML
    private Label NamaCustomer;

    @FXML
    private Label namaMobil;

    @FXML
    private Label NamaMerek;

    @FXML
    private Label TypeMobil;

    @FXML
    private Label PriceCar;

    @FXML
    private Label CarPrice;

    @FXML
    private Label StokMobil;
    
    @FXML
    private Label HargaMobil;

    @FXML
    private Label TotalHarga;

    @FXML
    private Label merk;

    @FXML
    private Label BanyakMobil;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnDelete;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private VBox pnItems = null;

    @FXML
    private TextField fieldId;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[1000];
        for (int i = 0; i < ListDataTransaksi.getsize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../view/TransactionList.fxml"));

                // give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #A9A9A9");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #FFF;");
                });

                // set the data to the labels
                IdMobil = (Label) nodes[i].lookup("#IdMobil");
                IdMobil.setText((i + 1) + "");

                NamaCustomer = (Label) nodes[i].lookup("#NamaCustomer");
                NamaCustomer.setText(ListDataTransaksi.getNamaCustomer(i));
                
                namaMobil = (Label) nodes[i].lookup("#namaMobil");
                namaMobil.setText(ListDataTransaksi.getNamaMobil(i));

                NamaMerek = (Label) nodes[i].lookup("#NamaMerek");
                NamaMerek.setText(ListDataTransaksi.getMerek(i));

                TypeMobil = (Label) nodes[i].lookup("#TypeMobil");
                TypeMobil.setText(ListDataTransaksi.getType(i));

                PriceCar = (Label) nodes[i].lookup("#PriceCar");
                PriceCar.setText(ListDataTransaksi.getPrice(i) + "");

                pnItems.getChildren().add(nodes[i]);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
                e.printStackTrace();
            }

        }else if (event.getSource() == btnEdit) {
            try {
                EditTransaksiController.idTransaksiEdit = Integer.parseInt(fieldId.getText())-1;
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/ListEditCar.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (event.getSource() == btnDelete){
            try {
                ListDataTransaksi.deletedata(Integer.parseInt(fieldId.getText())-1);

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Dashboard.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if
        (event.getSource() == btnCreate){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/CreateTransaksi.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }   
    
    
    }
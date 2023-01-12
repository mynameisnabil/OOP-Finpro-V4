package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.ListData;
import model.ListDataTransaksi;
import model.ListDataUser;

public class userPageController implements Initializable {

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnId;

    @FXML
    private AnchorPane pnlMain;

    @FXML
    private Pane pnItemsCar;

    @FXML
    private TextField txtId;

    // @FXML
    // private TextField txtName;

    @FXML
    private TextField IdtxtNamaMobil;

    @FXML
    private TextField IdtxtMerek;

    @FXML
    private TextField IdtxtPrice;


    @FXML
    private TextField IdtxtBanyak;

    @FXML
    private TextField IdtxtQty;

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
    private Label greetings;   

    public static String greeting;
    public static int idCustomer;


 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        greetings.setText(greeting);
        Node[] nodes = new Node[5];
        for (int i = 0; i < ListData.getSize(); i++) {
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../view/itemList.fxml"));

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #a9a9a9");
                });

                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #d3d3d3");
                });

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
                
                        } catch (Exception e) {
                            e.printStackTrace();

    }
    
    }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnPayment) {
            try {
                ListDataTransaksi.addTrans(ListDataUser.getUsername(idCustomer), IdtxtMerek.getText(), IdtxtMerek.getText(), Integer.parseInt(IdtxtPrice.getText()), Integer.parseInt(IdtxtQty.getText()), Integer.parseInt(IdtxtBanyak.getText()));

                int IdMobil = Integer.parseInt(txtId.getText());
                ListData.setStock(IdMobil, ListData.getStock(IdMobil) - Integer.parseInt(IdtxtQty.getText()));
            } catch (Exception e) {
                // TODO: handle exception
            }

        } else if (event.getSource() == btnLogout) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Login.fxml"));
                Parent root = loader.load();

                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else if (event.getSource() == btnId) {
            try {
                int id = Integer.parseInt(txtId.getText()) - 1;

                int qty = Integer.parseInt(IdtxtQty.getText());
                int price = ListData.getPrice(id);
                int stock = ListData.getStock(id);
                int amount = price * qty;
                System.out.println(amount);

                ListData.setStock(id, stock - qty);

                IdtxtNamaMobil.setText(ListData.getNamaMobil(id));
                IdtxtMerek.setText(ListData.getMerek(id));
                IdtxtPrice.setText(String.valueOf(price));
                IdtxtBanyak.setText(String.valueOf(amount));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

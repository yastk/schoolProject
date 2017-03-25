package sample;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;
import java.util.Request;

/**
 * Created by 17YTariq on 24/03/2017.
 */
public class Screen2Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    @FXML
    private AnchorPane rootPane;

    @FXML
    private JFXButton backButton;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        //Stage stage;
        //Parent root;
        //if(event.getSource()==backButton){
        //stage = (Stage) backButton.getScene().getWindow();
        //root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));

        AnchorPane pane = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    public static void requestArrayList() {
        ArrayList<Request> requestList = new ArrayList<Request>();
        requestList.add(Request);
    }
}


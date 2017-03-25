package sample;
/**
 * Created by 17YTariq on 21/03/2017.
 */
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;

    @FXML
    private void makeLogin(ActionEvent event) throws IOException {
        //Stage stage;
        //Parent root;
        //stage = (Stage) login.getScene().getWindow();
        //root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        String user = username.getText();
        String pass = password.getText();
        if (event.getSource() == login && user.equals("WijdanQFIS") && pass.equals("12345")) {
            System.out.println("Welcome Mr. Tariq! ");
            Stage stage = (Stage) login.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Try Again");
        }


        //Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        //Parent root = FXMLLoader.load(getClass().getResource("/homepage/homePage.fxml"));
        //Scene scene = new Scene(root, 1080, 720);
        //Main.instance.stage.setScene(scene);
        //Main.instance.scenes.add(scene);
        //Main.instance.stage.setX((primScreenBounds.getWidth() - Main.instance.stage.getWidth()) / 2);
        //Main.instance.stage.setY((primScreenBounds.getHeight() - Main.instance.stage.getHeight()) / 2);

    }

    //  @FXML
    // void register(ActionEvent event) {
    //   try{
    //     Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
    //   Parent root = FXMLLoader.load(getClass().getResource("/register/register.fxml"));
    // Main.instance.stage.setScene(new Scene(root, 1080, 720));
    //Main.instance.stage.setX((primScreenBounds.getWidth() - Main.instance.stage.getWidth()) / 2);
    //Main.instance.stage.setY((primScreenBounds.getHeight() - Main.instance.stage.getHeight()) / 2);
    //}catch(Exception e){
    //  e.printStackTrace();
    // }
    // }


    //////////////Screen1 Controller
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }



    @FXML
    private JFXTextField requesterFullName;

    @FXML
    private JFXTextField requesterEmailAddress;

    @FXML
    private JFXTextField requesterPhoneNumber;

    @FXML
    private JFXTextField resquesterDepartment;

    @FXML
    private JFXButton requestAdd;

    @FXML
    private JFXButton seePreviousRequests;

    @FXML
    private JFXTextField requestActivityTitle;

    @FXML
    private JFXTextField requestEventObjective;

    @FXML
    private JFXTextField requestActivityType;

    @FXML
    private JFXTextField eventSynopsis;

    @FXML
    private JFXTextField requestExpectedNumberOfAttendees;

    @FXML
    private JFXTextField requestSpecialRequests;

    @FXML
    private JFXTimePicker expectedStartTime;

    @FXML
    private JFXTimePicker expectedEndTime;

    @FXML
    private JFXDatePicker datePicker;


    @FXML
    private AnchorPane pane1;

    @FXML
    void addTheRequest(ActionEvent event) {


    }

    @FXML
    void seeThePreviousRequests(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
        pane1.getChildren().setAll(pane);
        }

    @FXML
    void startTime(ActionEvent event) {
        LocalTime time = expectedStartTime.getValue();
    }


    @FXML
    void endTime(ActionEvent event) {
        LocalTime time = expectedEndTime.getValue();
    }

    @FXML
    void setDate(ActionEvent event) {
        LocalDate date = datePicker.getValue();
    }



    /////////////////////////////////Screen2 Controller



}




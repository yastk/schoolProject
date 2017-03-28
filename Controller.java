package sample;
/**
 * Created by 17YTariq on 21/03/2017.
 */
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.LiteralNode;

import javax.swing.*;
import java.io.FileWriter;


public class Controller implements Initializable {
    public static ArrayList<Request> requestList = new ArrayList<Request>();



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
        if (event.getSource() == login && user.equals("12345") && pass.equals("12345")) {
            System.out.println("Welcome Mr. T! Here is your form!");
            Stage stage = (Stage) login.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Please try again");
        }


    }


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
    private JFXTextField requesterDepartment;

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


 //method for Add Button
    @FXML
    void onSubmit(ActionEvent event) {
        //JFXButton requestAdd = new JFXButton("Add");
        requestAdd.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                requestList.add(new Request(requesterFullName.getText(), requesterEmailAddress.getText(),
                        Integer.parseInt(requesterPhoneNumber.getText()),requesterDepartment.getText(),
                        requestActivityTitle.getText(), requestEventObjective.getText(),requestActivityType.getText(),
                        eventSynopsis.getText(), Integer.parseInt(requestExpectedNumberOfAttendees.getText()),requestSpecialRequests.getText(),
                        expectedStartTime.getValue().toString(),expectedEndTime.getValue().toString(),datePicker.getValue().toString()));
            }

            });
        for (Request r : requestList) {
            System.out.print(r);
        }
/**
        requesterFullName.clear();
        requesterEmailAddress.clear();
        requesterPhoneNumber.clear();
        requesterDepartment.clear();
        requestActivityTitle.clear();
        requestEventObjective.clear();
        requestActivityType.clear();
        eventSynopsis.clear();
        requestExpectedNumberOfAttendees.clear();
        requestSpecialRequests.clear();
        expectedStartTime.setValue(null);
        expectedEndTime.setValue(null);
        datePicker.setValue(null);
**/

        /**
         // STEP 1: get the new entry from the form
        Request newentry = new Request("Yasin", "yas2ktk@gmail.com", 123415, "finance",
                "football", "play football", "sport", "-", 22, "-", "1200", "200", "12th of March");

        // STEP 2: add the new entry into your arrayList of requests
        requestList.add(newentry);

        // STEP 3: clear the form
        requestList.clear();**/
    }

    private void clearForm() {
        requesterFullName.clear();
        requesterEmailAddress.clear();
        requesterPhoneNumber.clear();
        requesterDepartment.clear();
        requestActivityTitle.clear();
        requestEventObjective.clear();
        requestActivityType.clear();
        eventSynopsis.clear();
        requestExpectedNumberOfAttendees.clear();
        requestSpecialRequests.clear();
        expectedStartTime.setValue(null);
        expectedEndTime.setValue(null);
        datePicker.setValue(null);
    }
        /**Request entry = new Request(requesterFullName, requesterEmailAddress, requesterDepartment, requestActivityTitle, requestEventObjective,
                requestActivityType, eventSynopsis, requestExpectedNumberOfAttendees, requestSpecialRequests, expectedStartTime, expectedEndTime, datePicker);

        //insert data in table
        data.add(entry);

        //clear textfields
        clearForm();
    }*/

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

}

    /////////////////////////////////Screen2 Controller




//Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
//Parent root = FXMLLoader.load(getClass().getResource("/homepage/homePage.fxml"));
//Scene scene = new Scene(root, 1080, 720);
//Main.instance.stage.setScene(scene);
//Main.instance.scenes.add(scene);
//Main.instance.stage.setX((primScreenBounds.getWidth() - Main.instance.stage.getWidth()) / 2);
//Main.instance.stage.setY((primScreenBounds.getHeight() - Main.instance.stage.getHeight()) / 2);



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



package sample;

import com.jfoenix.controls.JFXTreeTableView;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static sample.Screen2Controller.requestArrayList;

public class Main extends Application {

    ArrayList<Request> requestList = new ArrayList<Request>();
    final ObservableList<Request> data = FXCollections.observableArrayList();


    public static void main(String[] args) {
        launch(args);


        /** ArrayList<Request> requestList = new ArrayList<Request>();
         requestList.add(new Request("Yasin", "yas2ktk@gmail.com", 123415, "finance",
         "football", "play football", "sport", "-", 22, "-", "1200", "200", "12th of March"));
         requestList.add(new Request("Hassan", "has@gmail.com", 123415, "cars",
         "soccer", "play football", "sport", "playing soccer with bros", 100, "-", "1200", "200", "4th of March"));
         for (Request r : requestList) {
         r.getRequesterFullName();
         System.out.print(r.getRequesterFullName());
         }
**/
    }

/**
    public void onSubmit(ActionEvent event) {
        // STEP 1: get the new entry from the form
        Request newentry = new Request("Yasin", "yas2ktk@gmail.com", 123415, "finance",
               "football", "play football", "sport", "-", 22, "-", "1200", "200", "12th of March");

        // STEP 2: add the new entry into your arrayList of requests
        ArrayList requestList = new ArrayList<Request>();
        requestList.add(newentry);

        // STEP 3: clear the form
       newentry.clearForm();
   }
   */



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        //primaryStage.setTitle("Requester Form");
        //primaryStage.setScene(new Scene(root, 800, 500));
        //primaryStage.show();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();




        /**new PropertyValueFactory<Request, String>("Full Name");


        JFXTreeTableView<> table;

        TreeTableColumn<Request,String> tableColumnFullName;

        TreeTableColumn<Request, String> tableColumnEmailAddress;


        TreeTableColumn<Request, Integer> tableColumnPhoneNumber;

        TreeTableColumn<Request, String> tableColumnDepartment;

        TreeTableColumn<Request, String> tableColumnActivity;

        TreeTableColumn<Request, String> tableColumnActivityType;

        TreeTableColumn<Request, String> tableColumnObjective;

        TreeTableColumn<Request, Integer> tableColumnExpectedNumberOfAttendees;

        TreeTableColumn<Request, String> tableColumnSynopsis;

        TreeTableColumn<Request, String> tableColumnSpecialRequests;
    }
         **/




        /** public static Main instance;
        Request request = new Request("Yasin", "yas2ktk@gmail.com",123415, "finance",
                "football","play football", "sport", "-", 22 ,"-", "1200", "200", "12th of March"); **/




}}

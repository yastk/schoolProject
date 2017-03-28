package sample;

import com.jfoenix.controls.JFXButton;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.cells.editors.base.JFXTreeTableCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Screen;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


//This is the controller for the final scene with the table in it
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
        /**

         //tableColumnFullName.setCellValueFactory(new PropertyValueFactory<Table, String>("rFullName"));
         //tableColumnEmailAddress.setCellValueFactory(new PropertyValueFactory<Table, String>("rEmailAddress"));
         //tableColumnPhoneNumber.setCellValueFactory(new PropertyValueFactory<Table, String>("rPhoneNumber"));



         //table.setItems(data);
         **/
    }

/**
    @FXML
    private JFXTreeTableView<Controller> table;

    @FXML
    private TreeTableColumn<Controller,String> tableColumnFullName;

    @FXML
    private TreeTableColumn<Request, String> tableColumnEmailAddress;

    @FXML
    private TreeTableColumn<Request, Integer> tableColumnPhoneNumber;

    @FXML
    private TreeTableColumn<Request, String> tableColumnDepartment;

    @FXML
    private TreeTableColumn<Request, String> tableColumnActivity;

    @FXML
    private TreeTableColumn<Request, String> tableColumnActivityType;

    @FXML
    private TreeTableColumn<Request, String> tableColumnObjective;

    @FXML
    private TreeTableColumn<Request, Integer> tableColumnExpectedNumberOfAttendees;

    @FXML
    private TreeTableColumn<Request, String> tableColumnSynopsis;

    @FXML
    private TreeTableColumn<Request, String> tableColumnSpecialRequests;

    final ObservableList<Request> data = FXCollections.observableArrayList();
**/
    @FXML
    private AnchorPane rootPane;

    @FXML
    private JFXButton backButton;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        /**Stage stage;
        Parent root;
        if(event.getSource()==backButton){
        stage = (Stage) backButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
         **/

        AnchorPane pane = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    public static void requestArrayList() {
        ArrayList<Request> requestList = new ArrayList<Request>();
        requestList.add(new Request("Yasin", "yas2ktk@gmail.com",123415, "finance",
                "football","play football", "sport", "-", 22 ,"-", "1200", "200", "12th of March"));
        requestList.add(new Request("Hassan", "has@gmail.com",123415, "cars",
                "soccer","play football", "sport", "playing soccer with bros", 100,"-", "1200", "200", "4th of March"));
        for (Request r: requestList){
            r.getRequesterFullName();
            System.out.print(r.getRequesterFullName());
        }
        //requestList.add(Request);
    }
}


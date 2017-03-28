package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by 17YTariq on 28/03/2017.
 */

//MYSQL CLASS (IGNORE)
public class DatabaseProject1 {

    public static void main(String[] args) {
        DatabaseProject1 project = new DatabaseProject1();
        project.createConnection();
    }


    void createConnection() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
                System.out.println("connection success");
            } catch (SQLException ex) {
            Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseProject1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
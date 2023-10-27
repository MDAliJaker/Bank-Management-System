package Bank.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
    Connection connection;
    public Statement statement;
    public Connect() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","01711701472");
            statement = connection.createStatement();

        } catch(Exception E){
            E.printStackTrace();
        }

    }
}

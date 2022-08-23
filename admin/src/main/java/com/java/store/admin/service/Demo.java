package com.java.store.admin.service;



import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Demo {

    // dataart
    public String dadada(Connection connection) throws SQLException, IOException {

        try {
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultset;
        Statement statement = null;
        try{
            statement= connection.createStatement();
            resultset = statement.executeQuery("");
            //connection.createStatement();
        } catch (Exception e) {

        }
        finally {
            statement.close();
        }

        return "";
    }
}

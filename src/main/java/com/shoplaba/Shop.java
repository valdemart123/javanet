package com.shoplaba;

import java.sql.*;

public class Shop{
    public static void main (String[] args) throws SQLException {
        final String user = "root";
        final String password = "password";
        final String url = "jdbc:mysql://localhost:9999/shoplab";

        final Connection connection = DriverManager.getConnection(url, user, password);

        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM ")){

        }

    }
}




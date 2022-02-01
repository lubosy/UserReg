package com.example.userreg;

import java.sql.*;

public class LoginDao {

    public static boolean validate(String name, String pass){
        boolean status = false;

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","hbstudent","hbstudent");

            PreparedStatement preparedStatement =connection.prepareStatement("select * from userreg where name =? and pass = ?");

            preparedStatement.setString(1,name);
            preparedStatement.setString(2,pass);

            ResultSet set = preparedStatement.executeQuery();

             status = set.next();

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return status;
    }
}

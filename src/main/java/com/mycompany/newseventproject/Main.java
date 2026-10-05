/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newseventproject;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author boldi
 */
public class Main {
    
    public static void main(String[] args)
    {
        Connection connection = null;
        try
        {
            //try to open the database
            connection = DatabaseConnection.getConnection();
            System.out.println("Connected to SQLite database");
            
        }
        catch (SQLException hiba)
        {
            System.out.println("Connection failed: " + hiba.getMessage());
        }
        finally
        {
            //always close the connection, even if an error happened 
            try
            {
                if (connection != null)
                {
                    connection.close();
                    System.out.println("Connection closed");
                }
                
            } catch(SQLException hiba)
            {
                System.out.println("Could not close connection: " + hiba.getMessage());
            }
        }
    }
}

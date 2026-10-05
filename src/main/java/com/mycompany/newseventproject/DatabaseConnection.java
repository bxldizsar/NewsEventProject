/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newseventproject;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author boldi
 */


public class DatabaseConnection {
    //folder and adress of the sqlite database file
    private static final String Database_FOLDER = "database";
    private static final String Database_URL = "jdbc:sqlite:database/news.db";
    
    //opens a new connection to the sqlite database
    public static Connection getConnection() throws SQLException 
    {
        //SQLite creates the file itslelf but not the folder
        File folder  = new File(Database_FOLDER);
        if(!folder.exists())
        {
            folder.mkdirs();
        }
        return DriverManager.getConnection(Database_URL);
    }
}

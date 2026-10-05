/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newseventproject;
import org.json.JSONObject;

/**
 *
 * @author boldi
 */
public class Main {
    
    public static void main(String[] args)
    {
        //check that the json library is available
        JSONObject test = new JSONObject();
        test.put("message", "JSON library works");
        System.out.println(test.getString("message"));
        
        //check that the SQLite driver is availabe
        
        try 
        {
            Class.forName("org.sqlite.JDBC");
            System.out.println("SQLite driver found");
            
        }
        catch (ClassNotFoundException hiba)
        {
            System.out.println("SQLite driver not found:" + hiba.getMessage());
        }
    }
}

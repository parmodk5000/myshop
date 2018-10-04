/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author The Evil Road
 */
@WebListener
public class Config implements ServletContextListener {

    public static Connection conn;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/derby", "root", "root");
            
            System.out.println("DB Connected");
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try{
            conn.close();
            
            System.out.println("DB Disconnected");
        }
        catch( Exception e ){
            e.printStackTrace();
        }
        
        System.out.println("Context Destroyed");
    }
    }

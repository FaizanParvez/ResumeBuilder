/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author om
 */
public class SetConnections {
    Connection con=null;
PreparedStatement preparedStatement=null;
    public SetConnections()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_resume","root","");
            //System.out.println("connection created");
        }
        catch(Exception e)
	{
            
        }
    }
    
}

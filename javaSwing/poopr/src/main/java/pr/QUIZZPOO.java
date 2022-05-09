/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr;
import java.sql.*;

/**
 *
 * @author Malek
 */
public class QUIZZPOO {
    public static Connection getcon()
    {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizj","root","123456789");
           return con;
       }
       catch(Exception e)
       
       {
           return null;
       }}
    }

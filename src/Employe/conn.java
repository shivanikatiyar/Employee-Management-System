
package Employe;
import java.sql.*;
public class conn {
    public Connection c;
    public Statement s;
    public conn(){ // constructor
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

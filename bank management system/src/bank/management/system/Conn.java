package bank.management.system;
//dont need main method,i use this calss as a object
//jdbc connection in 5 steps:
//Register the Driver
//Create Connection
//Create Statement
//Execute Query
//Close Connection
import java.sql.*;

public class Conn {
    //we user try-catch here,because as we are connection sql,so it is a external entity.so there are chances og getting errors at run time
    Connection c;
    Statement s;
    
    public Conn(){
        
        try{
         //  defaultly it is registered- Class.forName(com.mysql.cj.jdbc.Driver);//step1
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","1234");//step2
            s=c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

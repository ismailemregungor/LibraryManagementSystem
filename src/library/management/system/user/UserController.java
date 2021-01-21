
package library.management.system.user;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import library.management.system.database.DatabaseHelper;
import java.sql.*;


public class UserController extends User {
    
    DatabaseHelper databaseHelper;
    PreparedStatement preparedStatement;
    Connection connection;
   
    public UserController() {
        
        super();
        databaseHelper = new DatabaseHelper();
        connection = databaseHelper.getConnection();
        
    }
    
    
    public int createUser(User user){
        
        int result = 0;
        String sqlString = "";
        
        try {
            sqlString = "INSERT INTO User(UserName, Password) VALUES (?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlString);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            
            result = preparedStatement.executeUpdate();
            
        } catch (Exception exception) {
            
                  System.out.println("Kullanıcı Oluşturulamadı "  + exception);

        }
        return result;

    }
    
    
    public boolean checkUserInfo(User user){
        
         String sqlString = "";
         ResultSet resultSet = null;
        
        try {
            
            sqlString = "select * from user where UserName = ? and Password = ?";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sqlString);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            
            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                
                return  true;
            }
            else{
                
                return false;
            }
            
        } catch (Exception exception) {
            
           System.out.println("Kullanıcı Bilgileri Yanlış "  + exception);
            
        }
        
        return false;
    }

}

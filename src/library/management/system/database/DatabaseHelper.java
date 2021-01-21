
package library.management.system.database;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DatabaseHelper {

   static Connection connection;
   static String userName = "root";
   static final String password = "";
   static final String url =  "jdbc:mysql://localhost:3306/librarymanagementsystem";
   
    public DatabaseHelper(){
        
        getConnection();      
        
        userName = "root";
        String password = "";
        String url =  "jdbc:mysql://localhost:3306/librarymanagementsystem";
        
    }   
    public static Connection getConnection(){
        
         try {
                
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL Driver Nesnesi Bulundu.");
            connection =  (Connection) DriverManager.getConnection(url,userName,password);
            System.out.println("MySQL Veritabanına bağlantı sağlandı.");
            return connection;

        } catch (ClassNotFoundException classNotFoundException) {
            
            System.out.println("MySQL Driver Nesnesi Bulunamadı! :  "  + classNotFoundException);

      
        } catch (SQLException sqlException) {
            
            System.out.println("MySQL Veritabanına bağlanırkan hata oldu! :  "  + sqlException);

        }   
      return connection;
    }
}

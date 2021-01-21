
package library.management.system.log;


public class DatabaseLogger extends BaseLogger{

    public DatabaseLogger() {
        
    }

     @Override
     public void log(String message){
    
         System.out.println("Veritabanına Loglandı");
    
    }

}

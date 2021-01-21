
package library.management.system.info;


public class UserLoginInfo extends BaseInfo{

    @Override
    public void loggedIn() {
        
        System.out.println("Kullanıcı giriş yaptı!");
        
    }

    @Override
    public void notLoggedIn() {
        
          System.out.println("Kullanıcı giriş yapamadı!");

    }
   
}

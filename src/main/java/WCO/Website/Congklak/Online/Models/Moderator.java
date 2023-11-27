package WCO.Website.Congklak.Online.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Moderator implements Log{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;

    @Override
    public void login() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }
    @Override
    public void logoff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logoff'");
    }

    public void AlterDatabase(){
        
    }

}

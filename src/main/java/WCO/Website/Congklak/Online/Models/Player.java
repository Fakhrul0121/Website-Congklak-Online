package WCO.Website.Congklak.Online.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player implements Log{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String username;
    private String password;
    private int TotalScore;
    
    @OneToMany
    private List<GameResult> GameRecord;

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
    
    public void addGameResult(GameResult gr){

    }

    public void playGame(){

    }
}

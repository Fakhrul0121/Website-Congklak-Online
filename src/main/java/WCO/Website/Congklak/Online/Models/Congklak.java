package WCO.Website.Congklak.Online.Models;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import static java.lang.Math.abs;
import java.util.Dictionary;
import java.util.Enumeration;

public class Congklak{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Dictionary players;

    public Congklak(PlayerInGame[] players) {
        for (Player player : players) {
            this.players.put(player.username, player);
        }
    }
    public boolean checkEmpty(String player){
        PlayerInGame p = (PlayerInGame)this.players.get(player);
        for (int i = 0; i < p.holes.length; i++){
            if (p.holes[i] != 0){
                return false;
            }
        }
        return true;
    }
    
    
    public boolean MoveBeans(int holePicked, String player, String opponent){
        ////move the beans
        PlayerInGame p = (PlayerInGame)this.players.get(player);
        int beans = p.holes[holePicked];
        PlayerInGame o = (PlayerInGame)this.players.get(opponent);
        p.holes[holePicked] = 0;
        int i = holePicked + 1;
        while (true){
            if (i == 15){
                i = 0;
            }
            if (i < 7){
                p.holes[i] += 1;
            }else if (i == 7){
                p.house += 1;
            }else{
                o.holes[i - 8] += 1;
            }
            beans--;
            if (beans == 0){
                if (i == 7){
                    break;
                }else if (i < 7){
                    if (p.holes[i] <= 1){
                        break;
                    }else{
                        beans = p.holes[i];
                        p.holes[i] = 0;
                    }
                }else if (i > 7){
                    if (o.holes[i - 8] <= 1){
                        break;
                    }else{
                        beans = o.holes[i-8];
                        o.holes[i-8] = 0; 
                    }
                } 
            }
            i++;
        }
                
        if (i < 7 && p.holes[i] == 1 && o.holes[abs(i - 6)] != 0){
            int fill = 0;
            fill += p.holes[i];
            p.holes[i] = 0;
            fill += o.holes[abs(i - 6)];
            o.holes[abs(i - 6)] = 0;
            p.house += fill;
        }
        return i == 7;
    }

    private GameResult GenerateResult(){
        GameResult result = new GameResult();
        Enumeration<String> keys = players.keys();
        String p = keys.nextElement();
        PlayerInGame p1 = (PlayerInGame)this.players.get(p);
        p = keys.nextElement();
        PlayerInGame p2 = (PlayerInGame)this.players.get(p);
        if (p1.house > p2.house){
            result.winner = p1;
            result.loser = p2;
            result.winnerScore = p1.house;
            result.loserScore = p2.house;
        }else{
            result.winner = p2;
            result.loser = p1;
            result.winnerScore = p2.house;
            result.loserScore = p1.house;
        }
        ////insert the player and score variable to result
        return result;
    }
}





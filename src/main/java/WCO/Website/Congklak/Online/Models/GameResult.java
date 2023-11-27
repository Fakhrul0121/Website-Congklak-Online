package WCO.Website.Congklak.Online.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

public class GameResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    protected LocalDateTime date;
    protected Player winner;
    protected Player loser;
    protected int winnerScore;
    protected int loserScore;
}

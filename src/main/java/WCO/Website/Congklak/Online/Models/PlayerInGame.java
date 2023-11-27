package WCO.Website.Congklak.Online.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PlayerInGame extends Player {
    public int[] holes;
    public int house;

    public int pickHole(){
        return 0;
    }
}

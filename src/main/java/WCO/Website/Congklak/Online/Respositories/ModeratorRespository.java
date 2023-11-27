/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package WCO.Website.Congklak.Online.Respositories;


import WCO.Website.Congklak.Online.Models.Moderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author user
 */
@Repository
public interface ModeratorRespository extends JpaRepository<Moderator, Integer> {
    
}

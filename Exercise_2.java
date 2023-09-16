/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_photon_opetina;

/**
 *
 * @author cassandra
 */
public class Exercise_2 {

    public static void main(String[] args) {
        Artist profile1 = new Artist("Sidney Gish",94737,true);
        Artist profile2 = new Artist("Clairo",4108628,true);
        Artist profile3 = new Artist("Summer Salt",323202,true);
        
        Song song1 = new Song("4EVER by Clairo","Indie");
        Song song2 = new Song ("Sin Triangle by Sidney Gish","Indie Pop");
        
        Singer singer1 = new Singer ("Lucy Dacus",song2);
        singer1.performForAudience(50);
        singer1.changeFavSong(song2);
    }
    
    
}

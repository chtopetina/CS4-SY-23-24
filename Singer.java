/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_photon_opetina;

/**
 *
 * @author cassandra
 */
public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings = 0;
    Song favoriteSong;
    
    public Singer(String _name, Song _favoriteSong){
        name = _name;
        favoriteSong = _favoriteSong;
    }
    
    public void performForAudience(int audienceMember){
        noOfPerformances++;
        earnings += 100 * audienceMember;
        System.out.println(name + " performed for an audience of " + audienceMember + " people, and earned " + earnings + " dollars!"); 
    }
    
    public void changeFavSong(Song newFavorite){
        favoriteSong = newFavorite;
        System.out.println(name + " changed their favorite song to " + newFavorite.title + ". ");
    }
}


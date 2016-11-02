
package mvc_Main;

import Controller.ControllerClass;
import View.ViewClass;
import model.Genre;
import model.GenreList;
import model.Track;

public class mvc_MainClass {
    
     public static void main(String[] args){
         
         GenreList myListTracks=metod();
         ViewClass view=new ViewClass();
         ControllerClass controller=new ControllerClass(myListTracks,view);
         controller.printTrackList(myListTracks);
     }
     
     
     
     public static GenreList metod(){
         Track track1=new Track("lave","MyLives","Timati","3.45 min");
         Genre hip_hop=new Genre("Hip Hop");
         hip_hop.addTrack(track1);
         GenreList myGenreList=new GenreList();
         myGenreList.addGenre(0, hip_hop);
         return myGenreList;
     }
}

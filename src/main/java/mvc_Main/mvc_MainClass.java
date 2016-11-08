
package mvc_Main;

import Controller.ControllerClass;
import trackList.Genre;
import trackList.GenreList;

public class mvc_MainClass {
    
     public static void main(String[] args){
         ControllerClass controller=new ControllerClass();
         controller.readTrackList();
         controller.printTrackList();
     }
     
}

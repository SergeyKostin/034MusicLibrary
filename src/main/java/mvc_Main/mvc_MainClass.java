
package mvc_Main;

import Controller.ControllerClass;
import View.ViewClass;
import java.util.Scanner;
import model.Genre;
import model.GenreList;
import model.Track;

public class mvc_MainClass {
    
     public static void main(String[] args){
         ControllerClass controller=new ControllerClass();
         controller.readTrackList();
         controller.printTrackList();
     }
     
}

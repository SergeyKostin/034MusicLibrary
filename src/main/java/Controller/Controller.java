package Controller;
import java.util.ArrayList;
import java.util.List;
import model.Track;

public interface Controller {
    
   void createTrack();
   void createPlayList(ArrayList<Track> tracks);
   Track getTrackByName(String name);
   ArrayList<Track> getTracksByPlayList();
   List<Track> scanForTracks(); 
    
}

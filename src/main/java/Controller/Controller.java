package Controller;
import java.util.List;
import model.Track;

public interface Controller {
    
   void createTrack();
   void createPlayList(List<Track> tracks);
   Track getTrackByName(String name);
   List<Track> getTracksByPlayList();
   List<Track> scanForTracks(); 
    
}

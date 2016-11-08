package Controller;
import java.util.List;
import trackList.Track;

public interface Controller {
    
   void createTrack();
   void createPlayList(List<Track> tracks);
   Track getTrackByName(String name);
   List<Track> getTracksByPlayList();
   List<Track> scanForTracks(); 
    
}

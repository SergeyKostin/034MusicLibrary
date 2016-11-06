package model;

import java.util.List;

public interface Repository {
    Track getTrackByName(String name);
    Track findTrackByName(String name);
    List<Track> scanForTracks();
}


package View;

import model.GenreList;

public interface View {
    public void printTrackList(GenreList model);
    public void printTrackListByNameOfGenre(String nameGenre,GenreList model);
    public void printTrackListByIndexOfGenre(int indexGenre,GenreList model);
    public void printTrackListByBand(String band,GenreList model);
    public void printTrackListByAlbum(String album,GenreList model);
    public GenreList readTrackList();
}

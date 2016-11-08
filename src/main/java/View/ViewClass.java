package View;
import trackList.TrackList;

public class ViewClass implements View {

    public void printTrackList(TrackList trackList) {
        for (int i = 0; i < trackList.getGenres().size(); i++) {
            System.out.println(trackList.getGenres().get(i) + ":");
            for (int j = 0; j < trackList.getTracks().size(); j++)
                if (trackList.getTrack(j).getGenre().equals(trackList.getGenres().get(i)))
                    System.out.println("Исполнитель: " + trackList.getTrack(j).getBand() + "  Название трека: " + trackList.getTrack(j).getName() + "  Длина трека: " + trackList.getTrack(j).getDuration());
        }
    }

    public void printTracksByNameOfType(String type, TrackList trackList, String typeName) {
        switch (type) {
            case "Genre":
                System.out.println("Жанр: " + typeName);
                for (int i = 0; i < trackList.getTracks().size(); i++)
                    if (trackList.getTrack(i).getGenre().equals(typeName))
                        System.out.println("Альбом: " + trackList.getTrack(i).getAlbum() + " Исполнитель: " + trackList.getTrack(i).getBand() + "  Название трека: " + trackList.getTrack(i).getName() + "  Длина трека: " + trackList.getTrack(i).getDuration());
                break;
            case "Album":
                System.out.println("Альбом: " + typeName);
                for (int i = 0; i < trackList.getTracks().size(); i++)
                    if (trackList.getTrack(i).getGenre().equals(typeName))
                        System.out.println("Жанр: " + trackList.getTrack(i).getGenre() + " Исполнитель: " + trackList.getTrack(i).getBand() + "  Название трека: " + trackList.getTrack(i).getName() + "  Длина трека: " + trackList.getTrack(i).getDuration());
                break;
            case "Band":
                System.out.println("Исполнитель: " + typeName);
                for (int i = 0; i < trackList.getTracks().size(); i++)
                    if (trackList.getTrack(i).getGenre().equals(typeName))
                        System.out.println("Жанр: " + trackList.getTrack(i).getGenre() + " Альбом: " + trackList.getTrack(i).getAlbum() + "  Название трека: " + trackList.getTrack(i).getName() + "  Длина трека: " + trackList.getTrack(i).getDuration());
                break;
        }
    }
}

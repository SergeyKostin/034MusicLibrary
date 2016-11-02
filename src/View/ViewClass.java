
package View;

import model.GenreList;

public class ViewClass 
 { 
  
    public void printTrackList(GenreList model) 
     { 
         for (int i = 0; i<model.getGenres().size(); i++) 
         {
             System.out.println(model.getGenre(i).getNameOfGenre() + ":"); 
             for (int j = 0; j<model.getGenre(i).getTracks().size(); j++) 
             { 
                 System.out.println(model.getGenre(i).getTrack(j).getAlbum()); 
                 System.out.println("Исполнитель: "+model.getGenre(i).getTrack(j).getBand() + "  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
             } 
         } 
     } 
    public void printTrackListByNameOfGenre(String nameGenre,GenreList model){
        int flag=0;
         for (int i = 0; i<model.getGenres().size(); i++) 
         {
             if(model.getGenre(i).getNameOfGenre().equals(nameGenre)){
                 flag=1;
                 System.out.println(model.getGenre(i).getNameOfGenre() + ":");
             for (int j = 0; j<model.getGenre(i).getTracks().size(); j++) 
             { 
                 System.out.println(model.getGenre(i).getTrack(j).getAlbum()); 
                 System.out.println("Исполнитель: "+model.getGenre(i).getTrack(j).getBand() + "  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
             } 
         } 
         }
         if(flag==0) System.out.println("Жанр не найден");
    }
    public void printTrackListByIndexOfGenre(int indexGenre,GenreList model){
        for (int j = 0; j<model.getGenre(indexGenre).getTracks().size(); j++) 
             { 
                 System.out.println(model.getGenre(indexGenre).getTrack(j).getAlbum()); 
                 System.out.println("Исполнитель: "+model.getGenre(indexGenre).getTrack(j).getBand() + "  Название трека: " + model.getGenre(indexGenre).getTrack(j).getName() + "  Длина трека: " + model.getGenre(indexGenre).getTrack(j).getDuration()); 
             } 
    }
    public void printTrackListByBand(String band,GenreList model){
        System.out.println(band+":");
        int flag=0;
        for(int i=0;i<model.getGenres().size();i++)
            for(int j=0; j<model.getGenre(i).getTracks().size(); j++){
                if(model.getGenre(i).getTrack(i).getBand().equals(band)==true){
                 
                    System.out.println("  Альбом: "+model.getGenre(i).getTrack(j).getAlbum()+"  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
                    flag=1;
                }
            }
        if(flag==0) System.out.println("Исполнитель не найден");
    }
    public void printTrackListByAlbum(String album,GenreList model){
        System.out.println(album+":");
        int flag=0;
        for(int i=0;i<model.getGenres().size();i++){
            for(int j=0;j<model.getGenre(i).getTracks().size();j++){
                if(model.getGenre(i).getTrack(j).getAlbum().equals(album)==true){
                    System.out.println("Исполнитель: "+model.getGenre(i).getTrack(j).getBand() + "  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
                    flag=1;
            }
        }
    }
        if(flag==0)System.out.println("Альбом не найден");
 } 
}


package View;

import static java.lang.System.in;
import java.util.Scanner;
import model.Genre;
import model.GenreList;
import model.Track;

public class ViewClass implements View 
 { private int flag=0;
  
    public void printTrackList(GenreList model) 
       { 
           if(this.flag==0){
               Scanner in = new Scanner(System.in);
               System.out.print("Желаете вывести данные? 'yes' or 'no'");
               String str1=in.nextLine();
                 if(str1.equals("yes")){
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
    }
  }
    public void printTrackListByNameOfGenre(String nameGenre,GenreList model){
        if(this.flag==0){
        int flag1=0;
         for (int i = 0; i<model.getGenres().size(); i++) 
         {
             if(model.getGenre(i).getNameOfGenre().equals(nameGenre)){
                 flag1=1;
                 System.out.println(model.getGenre(i).getNameOfGenre() + ":");
             for (int j = 0; j<model.getGenre(i).getTracks().size(); j++) 
             { 
                 System.out.println(model.getGenre(i).getTrack(j).getAlbum()); 
                 System.out.println("Исполнитель: "+model.getGenre(i).getTrack(j).getBand() + "  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
             } 
         } 
         }
         if(flag1==0) System.out.println("Жанр не найден");
    }
    }
    public void printTrackListByIndexOfGenre(int indexGenre,GenreList model){
        if(this.flag==0){
        for (int j = 0; j<model.getGenre(indexGenre).getTracks().size(); j++) 
             { 
                 System.out.println(model.getGenre(indexGenre).getTrack(j).getAlbum()); 
                 System.out.println("Исполнитель: "+model.getGenre(indexGenre).getTrack(j).getBand() + "  Название трека: " + model.getGenre(indexGenre).getTrack(j).getName() + "  Длина трека: " + model.getGenre(indexGenre).getTrack(j).getDuration()); 
             } 
    }
    }
    public void printTrackListByBand(String band,GenreList model){
        if(this.flag==0){
        System.out.println(band+":");
        int flag1=0;
        for(int i=0;i<model.getGenres().size();i++)
            for(int j=0; j<model.getGenre(i).getTracks().size(); j++){
                if(model.getGenre(i).getTrack(i).getBand().equals(band)==true){
                 
                    System.out.println("  Альбом: "+model.getGenre(i).getTrack(j).getAlbum()+"  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
                    flag1=1;
                }
            }
        if(flag1==0) System.out.println("Исполнитель не найден");
    }
    }
    public void printTrackListByAlbum(String album,GenreList model){
        if(this.flag==0){
        System.out.println(album+":");
        int flag1=0;
        for(int i=0;i<model.getGenres().size();i++){
            for(int j=0;j<model.getGenre(i).getTracks().size();j++){
                if(model.getGenre(i).getTrack(j).getAlbum().equals(album)==true){
                    System.out.println("Исполнитель: "+model.getGenre(i).getTrack(j).getBand() + "  Название трека: " + model.getGenre(i).getTrack(j).getName() + "  Длина трека: " + model.getGenre(i).getTrack(j).getDuration()); 
                    flag1=1;
            }
        }
        }
    }
        if(flag==0)System.out.println("Альбом не найден");
 } 
    public GenreList readTrackList(){
        this.flag=1;
        Scanner in=new Scanner(System.in);
        GenreList trackList=new GenreList();
        int index=0;
        String nameGenre="",nameTrack="",album="",band="",duration="";
        String str="yes";
        while(str.equals("yes")){
        System.out.print("Введите жанр трэка:");
        nameGenre=in.nextLine();
        System.out.print("Введите название трэка:");
        nameTrack=in.nextLine();
        System.out.print("Введите название альбома:");
        album=in.nextLine();
        System.out.print("Введите исполнителя:");
        band=in.nextLine();
        System.out.print("Введите продолжительность трэка:");
        duration=in.nextLine();
        Track track=new Track(nameTrack,album,band,duration);
        Genre genre=new Genre(nameGenre);
        genre.addTrack(track);
       
        trackList.addGenre(index, genre);
        System.out.print("Желаете продалжить? 'yes' or 'no'");
        str=in.nextLine();
        System.out.println();
    }    
        
        this.flag=0;
    return trackList;
    }
}


package project_1;

import java.util.ArrayList;
import java.util.Scanner;


public class Project_1 {


   public static void main(String[] args) {
        ArrayList <Track>MyTrackList=new ArrayList();
        Genre jazz=new Genre("Jazz");
        Genre hip_Hop=new Genre("Hip Hop");
        Genre rock=new Genre("Rock");
        Genre other=new Genre("Other");
       
        GenreList genres=new GenreList();
        genres.addGenre(0,jazz);
        genres.addGenre(1,hip_Hop);
        genres.addGenre(2,rock);
        genres.addGenre(3,other);
        
        System.out.println("Заполните данные");
        System.out.println("Выберите жанр");
        for(int i=0;i<genres.getGenreListSize();i++)
            System.out.println(i+" "+genres.getGenre(i).getNameOfGenre());
        int t=0;
        int ff=0;
         Scanner in=new Scanner(System.in);
        while(ff==0){
            
       System.out.println("Введите номер жанра:");
       int number=in.nextInt();
       
       System.out.println("Введите имя трэка ");
       String nameOfTrack="xsx";
               nameOfTrack=in.nextLine();
       System.out.println("Введите имя альбома ");
       String album=in.nextLine(); 
       System.out.println("Введите исполнителя");
       String band=in.nextLine(); 
       System.out.println("Введите длину трэка");
       String duration=in.nextLine(); 
       Track track=new Track(nameOfTrack, album, band, duration);
       genres.getGenres().get(number).addTrack(nameOfTrack, album, band, duration);
//       genres.getGenre(number).addTrack(nameOfTrack, album, band, duration);
       
        t++;}
        System.out.println("что бы продолжить введите 0, для выхода введите любое число");
        ff=in.nextInt();
                                     }
        
        
        
    }
    
}

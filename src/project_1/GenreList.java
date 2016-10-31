
package project_1;

import java.util.ArrayList;

public class GenreList 
 { 

   private ArrayList<Genre> genres; 
     
     
    public GenreList(){
    this.genres=new ArrayList();
    }
    public GenreList(ArrayList<Genre> genres) 
     { 
         this.genres = genres; 
         
     } 
     public Genre getGenre(int index) 
     { 
         return genres.get(index); 
     } 
     public ArrayList<Genre> getGenres() 
     {
         return genres;
     } 
     
     public int getGenreListSize(){
         int size=0;
         for(int i=0;i<this.genres.size();i++)
             size++;
         return size;
     }
     public void addGenre(int index, Genre newGenre) 
     { 
         genres.add(index, newGenre); 
     } 
     public void deleteGenre(int index) 
     { 
         for (int i = 0; i < getGenre(index).getTracks().size(); i++) 
             getGenre(index).deleteTrack(i); 
         genres.remove(index); 
     } 
     public void setGenre(int index, Genre newGenre) 
     { 
         genres.set(index, newGenre); 
     } 
     public void sortGenres() 
     { 
         genres.sort((o1,o2) -> o1.getNameOfGenre().compareTo(o2.getNameOfGenre())); 
     } 
 } 


package model;

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
     public Genre getGenre(String nameGenre) 
     { Genre genre=null;
         for(int i=0;i<genres.size();i++)
              if(this.getGenre(i).getNameOfGenre().equals(nameGenre)==true)
                  genre=getGenre(i);
         return genre;
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
     public Track getTrackByNameOfTrack(String nameOfTrack){
         Track track=null;
         for(int i=0;i<this.genres.size();i++)
             for(int j=0;j<this.getGenre(i).getTracks().size();j++)
                 if(nameOfTrack.equals(this.getGenre(i).getTrack(j).getName())==true)
                     track=this.getGenre(i).getTrack(j);
         return track;
     }
     public void sortGenres() 
     { 
         genres.sort((o1,o2) -> o1.getNameOfGenre().compareTo(o2.getNameOfGenre())); 
     } 
     public void setNameOfGenre(String newNameOfGenre,int index){
         this.getGenre(index).setNameOfGenre(newNameOfGenre);
     }
     public void setTrack(int indexGenre,Track newTrack,int index){
         this.getGenre(indexGenre).setTrack(newTrack, index);
     }
     public void addTrack(String nameOfGenre,String nameOfTrack, String album, String band, String duration){
         this.getGenre(nameOfGenre).addTrack(nameOfTrack, album, band, duration);
     }
     public void addTrack(int indexByGenre,String nameOfTrack, String album, String band, String duration){
         this.getGenre(indexByGenre).addTrack(nameOfTrack, album, band, duration);
     }
     public void deleteTrack(String nameOfGenre,int index){
         this.getGenre(nameOfGenre).deleteTrack(index);
     }
     public void deleteTrack(int indexByGenre,int index){
         this.getGenre(indexByGenre).deleteTrack(index);
     }
     public void sortTracks(String nameOfGenre,String type){
         this.getGenre(nameOfGenre).sortTracks(type);
     }
     public void sortTracks(int indexOfGenre,String type){
         this.getGenre(indexOfGenre).sortTracks(type);
     }
 } 

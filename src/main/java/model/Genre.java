
package model;

import java.util.ArrayList;

public class Genre { 
    private String nameOfGenre; 
     private ArrayList<Track> tracks=new ArrayList<Track>(); 
 
 
     public Genre(String nameOfGenre, ArrayList<Track> tracks) { 
         this.nameOfGenre = nameOfGenre; 
         this.tracks = tracks; 
     } 
     public Genre(String nameOfGenre){
         this.nameOfGenre=nameOfGenre;
     }
 
     public Track getTrack(int index) { 
         return tracks.get(index); 
     } 
 
 
     public ArrayList<Track> getTracks() { return tracks; } 
 
 
     public String getNameOfGenre() { return nameOfGenre; } 
 
 
     public void setNameOfGenre(String newNameOfGenre) { this.nameOfGenre = newNameOfGenre; } 
 
 
     public void setTrack(Track newTrack,int index) { tracks.set(index, newTrack); } 
 
 
     public void addTrack(String nameOfTrack, String album, String band, String duration) { 
         Track newTrack = new Track(nameOfTrack, album, band, duration); 
         tracks.add(newTrack); 
     } 
     public void addTrack(Track track){
         this.tracks.add(track);
     }
 
     public void deleteTrack(int index) { 
         tracks.remove(index); 
     } 
 
 
     public void sortTracks(String type) { 
         if (type.equals("Duration")) 
             tracks.sort((o1, o2) -> o1.getDuration().compareTo(o2.getDuration())); 
         if (type.equals("Name")) 
             tracks.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); 
         if (type.equals("Album")) 
             tracks.sort((o1, o2) -> o1.getAlbum().compareTo(o2.getAlbum())); 
         if (type.equals("Band")) 
             tracks.sort((o1, o2) -> o1.getBand().compareTo(o2.getBand())); 
     } 
 } 
 
 


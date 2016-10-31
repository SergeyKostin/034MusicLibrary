/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

public class ViewClass 
 { 
     private GenreList trackList; 
     public ViewClass(GenreList trackList) 
     { 
         this.trackList = trackList; 
     } 
     public GenreList getTrackList() 
     { 
         return this.trackList; 
     } 
    public void printTrackList() 
     { 
         for (int i = 0; i<trackList.getGenres().size(); i++) 
         { 
             System.out.println(trackList.getGenre(i).getNameOfGenre() + ":"); 
             for (int j = 0; j<trackList.getGenre(i).getTracks().size(); i++) 
             { 
                 System.out.println(trackList.getGenre(i).getTrack(j).getAlbum()); 
                 System.out.println(trackList.getGenre(i).getTrack(j).getBand() + " - " + trackList.getGenre(i).getTrack(j).getName() + "   " + trackList.getGenre(i).getTrack(j).getDuration()); 
             } 
         } 
     } 
 } 

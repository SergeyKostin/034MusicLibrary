/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewClass;
import java.util.Scanner;
import model.Genre;
import model.GenreList;
import model.Track;

public class ControllerClass {
    private GenreList model;
    private ViewClass view;
     
    public ControllerClass(GenreList model, ViewClass view){
        this.model=model;
        this.view=view;
    }

    public ControllerClass() {
        this.model=new GenreList();
        this.view=new ViewClass();      
    }
    
    public GenreList getGenreList(){
        return this.model;
    }
    public void setGenreList(GenreList model){
        this.model=model;
    }
    public Genre getGenre(int index){
        return this.model.getGenre(index);
    }
    public void setGenre(int index, Genre genre){
        this.setGenre(index, genre);
    }
    public Track getTrack(String nameTrack){
        return this.getTrack(nameTrack);
    }
    public int getGenreListSize(){
        return this.getGenreListSize();
    }
    public void addGenre(int index, Genre newGenre){
        this.model.addGenre(index, newGenre);
    }
    public void deleteGenre(int index){
        this.deleteGenre(index);
    }
    public void sortGenres(){
        this.sortGenres();
    }
    public void setNameOfGenre(String newNameOfGenre,int index){
        this.model.setNameOfGenre(newNameOfGenre, index);
    }
    public void setTrack(int indexGenre,Track newTrack,int index){
        this.setTrack(indexGenre, newTrack, index);
    }
    public void addTrack(String nameOfGenre,String nameOfTrack, String album, String band, String duration){
        this.model.addTrack(nameOfGenre, nameOfTrack, album, band, duration);
    }
    public void addTrack(int indexByGenre,String nameOfTrack, String album, String band, String duration){
        this.model.addTrack(indexByGenre, nameOfTrack, album, band, duration);
    }
    public void deleteTrack(String nameOfGenre,int index){
        this.model.deleteTrack(nameOfGenre, index);
    }
    public void deleteTrack(int indexByGenre,int index){
        this.model.deleteTrack(indexByGenre, index);
    }
    public void sortTracks(String nameOfGenre,String type){
        this.model.sortTracks(nameOfGenre, type);
    }
    public void sortTracks(int indexOfGenre,String type){
        this.model.sortTracks(indexOfGenre, type);
    }
    
    
    public void printTrackList(){
        this.view.printTrackList(model);
    }
    public void printTrackListByNameOfGenre(String nameGenre){
        this.view.printTrackListByNameOfGenre(nameGenre, model);
    }
  
    public void printTrackListByIndexOfGenre(int indexGenre){
        this.view.printTrackListByIndexOfGenre(indexGenre, model);
    }
    public void printTrackListByBand(String band){
        this.view.printTrackListByBand(band, model);
    }
    public void printTrackListByAlbum(String album){
        this.view.printTrackListByAlbum(album, model);
    }
    public GenreList read1TrackList(){
        return this.view.readTrackList();
    }
    public void readTrackList(){
        this.model=this.view.readTrackList();
    }
}

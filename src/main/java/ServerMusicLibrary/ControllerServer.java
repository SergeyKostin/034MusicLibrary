/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerMusicLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author User
 */
public class ControllerServer implements Controller {
    private TrackList model;

    @Override
    public void createTrack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createPlayList(ArrayList<Track> tracks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Track getTrackByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Track> getTracksByPlayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Track> scanForTracks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  void Comands(String comand,String locFaile) throws IOException{
       
        switch(comand){
           
            case "readTXT":
            {
                System.out.println("readTXT");
                model=ReadTxtTrackList(locFaile);
                System.out.println("readTXT");
                break;
            }   
            case"readXML":
            {
            model= RepositoryClass.ReadXmlTrackList(locFaile);
                System.out.println("readXML");
            break;
            }   
            case"writeTXT":
            {
            this.WriterTxtTrackList(model,locFaile);
                System.out.println("writeTXT");
            break;
            }
            case"writeXML":
            {
            RepositoryClass.WriterXmlTrackList(model, locFaile);
                System.out.println("writeXML");
            break;
            }
        }
    }
    
    public TrackList ReadTxtTrackList(String str) throws FileNotFoundException, IOException{
        TrackList trackList=new TrackList();
        BufferedReader read = new BufferedReader(new FileReader(str+".txt"));
        String tracks;
        int index=0;
        while((tracks=read.readLine())!=null){
            String [] tr=tracks.split(";");
            Track track=new Track(tr[0],tr[1],tr[2],tr[3],tr[4]);
            trackList.addTrack(index, track);
            index++;
        }
        read.close();
        return trackList;
    }
    
    public void WriterTxtTrackList(TrackList tracList, String str) throws FileNotFoundException, IOException{
       PrintWriter writ=new PrintWriter(new BufferedWriter(new FileWriter(str+".txt")));
       for(int i=0;i<tracList.getTracks().size();i++){
           writ.write(tracList.getTrack(i).getGenre()+" "+tracList.getTrack(i).getAlbum()+" "+tracList.getTrack(i).getBand()+" "+tracList.getTrack(i).getName()+" "+tracList.getTrack(i).getDuration());
           writ.append("\n");
       }
       writ.close();
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientsMusicLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button save_nameTrackList;
    @FXML
    private TextField textNameTrackList;
    @FXML
    private TableView<Track> tableTracs=new TableView<Track>();
    @FXML
    private TableColumn<Track,String> nameOfTrackCol = new TableColumn<Track,String>("nameOfTrack");
    @FXML
    private TableColumn<Track,String> albumCol = new TableColumn<Track,String>("album");
    @FXML
    private TableColumn<Track,String> bandCol = new TableColumn<Track,String>("band");
    @FXML
    private TableColumn<Track,String> durationCol = new TableColumn<Track,String>("duration");
    @FXML  
    private TableColumn<Track,String> genreCol = new TableColumn<Track,String>("genre");
   
    
    private String location;
    private ObservableList<Track> tracksData;
    
    private static int serverPort=5555;
    private static String address = "127.0.0.1";
    
    
    

    @FXML
    private void ActionReadTxt(ActionEvent event) {
       Stage stage = new Stage();
       StackPane root = new StackPane();
       stage.setTitle("Введите путь к файлу");
       TextField textArea = new TextField();
       Button but=new Button("read tracks");
       root.getChildren().addAll(textArea, but);
       Scene scene = new Scene(root,350,70);
       root.setAlignment(Pos.CENTER_RIGHT);
       stage.setScene(scene);
       stage.show();
         but.setOnAction(e -> {
            this.location=textArea.getText();
            stage.close();
           try {
               
               InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
               Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
               OutputStream sout = socket.getOutputStream();
               DataOutputStream out = new DataOutputStream(sout);
               String line ="readTXT%";
               line+=location;
               out.writeUTF(line); // отсылаем введенную строку текста серверу.
               out.flush(); // заставляем поток закончить передачу данных.
             
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
       
       
    }
     @FXML
    private void ActionReadXml(ActionEvent event) {
         Stage stage = new Stage();
       StackPane root = new StackPane();
       TextField textArea = new TextField();
       Button but=new Button("read tracks");
       root.getChildren().addAll(textArea, but);
       stage.setTitle("Введите путь к файлу");
       Scene scene = new Scene(root,350,70);
       root.setAlignment(Pos.CENTER_RIGHT);
       stage.setScene(scene);
       stage.show();
         but.setOnAction(e -> {
            this.location=textArea.getText();
            stage.close();
           try {
               InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
               Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
               OutputStream sout = socket.getOutputStream();
               DataOutputStream out = new DataOutputStream(sout);
               String line ="readXML%";
               line+=location;
               out.writeUTF(line); // отсылаем введенную строку текста серверу.
               out.flush(); // заставляем поток закончить передачу данных.
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
    }
    @FXML
    private void ActionReadMp3(ActionEvent event) {
         Stage stage = new Stage();
       StackPane root = new StackPane();
       TextField textArea = new TextField();
       Button but=new Button("read tracks");
       root.getChildren().addAll(textArea, but);
       stage.setTitle("Введите путь к файлу");
       Scene scene = new Scene(root,350,70);
       root.setAlignment(Pos.CENTER_RIGHT);
       stage.setScene(scene);
       stage.show();
         but.setOnAction(e -> {
            this.location=textArea.getText();
            stage.close();
           try {
              InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
               Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
               OutputStream sout = socket.getOutputStream();
               DataOutputStream out = new DataOutputStream(sout);
               String line ="readMP3%";
               line+=location;
               out.writeUTF(line); // отсылаем введенную строку текста серверу.
               out.flush(); // заставляем поток закончить передачу данных.
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
    }
   
                 
    @FXML
    private void ActionWriteTxt(ActionEvent event) {
         Stage stage = new Stage();
       StackPane root = new StackPane();
       TextField textArea = new TextField();
       Button but=new Button("write tracks");
       root.getChildren().addAll(textArea, but);
       stage.setTitle("Введите путь к файлу");
       Scene scene = new Scene(root,350,70);
       root.setAlignment(Pos.CENTER_RIGHT);
       stage.setScene(scene);
       stage.show();
         but.setOnAction(e -> {
            this.location=textArea.getText();
            stage.close();
           try {
               InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
               Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
               OutputStream sout = socket.getOutputStream();
               DataOutputStream out = new DataOutputStream(sout);
               String line ="writeTXT%";
               line+=location;
               out.writeUTF(line); // отсылаем введенную строку текста серверу.
               out.flush(); // заставляем поток закончить передачу данных.
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
    }
   
    @FXML
    private void ActionWriteXml(ActionEvent event) {
       Stage stage = new Stage();
       StackPane root = new StackPane();
       TextField textArea = new TextField();
       Button but=new Button("write tracks");
       root.getChildren().addAll(textArea, but);
       stage.setTitle("Введите путь к файлу");
       Scene scene = new Scene(root,350,70);
       root.setAlignment(Pos.CENTER_RIGHT);
       stage.setScene(scene);
       stage.show();
         but.setOnAction(e -> {
            this.location=textArea.getText();
            stage.close();
           try {
               InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
               Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
               OutputStream sout = socket.getOutputStream();
               DataOutputStream out = new DataOutputStream(sout);
               String line ="writeXML%";
               line+=location;
               out.writeUTF(line); // отсылаем введенную строку текста серверу.
               out.flush(); // заставляем поток закончить передачу данных.
           } catch (IOException ex) {
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
           }
        });
    }
   
    
   /* public void initialize() {
       this.textNameTrackList.setText(model.getNameTrackList());
        save_nameTrackList.setOnAction(e->{
            this.model.setNameTrackList(textNameTrackList.getText());
            });
        
        tracksData = FXCollections.observableArrayList(model.getTracks());
       
        nameOfTrackCol.setCellValueFactory(new PropertyValueFactory<Track, String>("name"));
        nameOfTrackCol.setCellFactory(TextFieldTableCell.<Track> forTableColumn());
        nameOfTrackCol.setOnEditCommit((CellEditEvent<Track, String> event) -> {
            TablePosition<Track, String> pos = event.getTablePosition();
            String newNameOfTrack = event.getNewValue();
            int row = pos.getRow();
            Track trac = event.getTableView().getItems().get(row);

            model.getTrack(row).setName(newNameOfTrack);
        });


        albumCol.setCellValueFactory(new PropertyValueFactory<Track, String>("album"));
        albumCol.setCellFactory(TextFieldTableCell.<Track> forTableColumn());
        albumCol.setOnEditCommit((CellEditEvent<Track, String> event) -> {
            TablePosition<Track, String> pos = event.getTablePosition();
            String album = event.getNewValue();
            int row = pos.getRow();
            Track trac = event.getTableView().getItems().get(row);
            model.getTrack(row).setAlbum(album);
        });
        bandCol.setCellValueFactory(new PropertyValueFactory<Track, String>("band"));
        bandCol.setCellFactory(TextFieldTableCell.<Track> forTableColumn());
        bandCol.setOnEditCommit((CellEditEvent<Track, String> event) -> {
            TablePosition<Track, String> pos = event.getTablePosition();
            String band = event.getNewValue();
            int row = pos.getRow();
            Track trac = event.getTableView().getItems().get(row);
            model.getTrack(row).setBand(band);
        });
        durationCol.setCellValueFactory(new PropertyValueFactory<Track, String>("duration"));
        durationCol.setCellFactory(TextFieldTableCell.<Track> forTableColumn());
        durationCol.setOnEditCommit((CellEditEvent<Track, String> event) -> {
            TablePosition<Track, String> pos = event.getTablePosition();
            String duration = event.getNewValue();
            int row = pos.getRow();
            Track trac = event.getTableView().getItems().get(row);
            model.getTrack(row).setDuration(duration);
        });
        genreCol.setCellValueFactory(new PropertyValueFactory<Track, String>("genre"));
        genreCol.setCellFactory(TextFieldTableCell.<Track> forTableColumn());
        genreCol.setOnEditCommit((CellEditEvent<Track, String> event) -> {
            TablePosition<Track, String> pos = event.getTablePosition();
            String genre = event.getNewValue();
            int row = pos.getRow();
            Track trac = event.getTableView().getItems().get(row);
            model.getTrack(row).setGenre(genre);
        });
        tableTracs.setItems(tracksData);
        
        
    }    */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
    }
    
}

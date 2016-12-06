/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermusiclibrary;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMusicLibrary {

    public static void main(String[] args) {
        int port=5555;// случайный порт (может быть любое число от 1025 до 65535)
        try{
            ServerSocket serv=new ServerSocket(port);// создаем сокет сервера и привязываем его к вышеуказанному порту
            Socket sock=serv.accept();// заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
            System.out.println("Got a client :) ... Finally, someone saw me through all the cover!");
// Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту. 
            InputStream sin=sock.getInputStream();
            OutputStream sout=sock.getOutputStream();
            
            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in=new DataInputStream(sin);
            DataOutputStream out=new DataOutputStream(sout);
            
            ControllerServer controll=new ControllerServer();
            String line;
            while(true){
                line=in.readUTF();
                System.out.println("The dumb client just sent me this line : " + line);
                System.out.println("I'm sending it back...");
                String [] str;
                str=line.split("%");
                String comand=str[0];
                String loc=str[1];
                System.out.println("The Comand:  "+comand);
                System.out.println("The location file:  "+loc);
               
                controll.Comands(comand,loc);
            }
            
        }
        catch(Exception x) { x.printStackTrace(); }
    }
    
}

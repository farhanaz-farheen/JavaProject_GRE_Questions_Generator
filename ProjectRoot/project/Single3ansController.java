/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Single3ansController implements Initializable {

    @FXML
    private Label ANSWERS;
    @FXML
    private Label score;
    @FXML
    private Button back;
    @FXML
    private Label time;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         String time1 = Accessinguser.getcheck().gettime();
         String warning = Accessinguser.getcheck().getcode();
         if(warning.contains("5istaken")){
             score.setText("You've already taken this test before!");
         }
         else if(warning.contains("5isfree")){
            int scores = Accessinguser.getcheck().getscore();
            score.setText("Your score is " + scores);
         }
         if(time1.contains("TimeUP")){
             time.setText("Your time is up!");
         }
         try{           
            Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port " + 12323);
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF("singleblank3");
            DataInputStream in = new DataInputStream(sock.getInputStream());
            String incoming = in.readUTF();
            sock.close();
            ANSWERS.setText(incoming);
           }catch(Exception e){
             System.out.println("exception while sending");
        }        
    }

    @FXML
    private void backtomm(ActionEvent event) throws IOException {
        Project.showhome();
    }
}
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignInController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField passvalue;
    @FXML
    private Label lbstatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Accessinguser.getcheck().setusername(username);
    }    

    @FXML
    private void home(ActionEvent event) throws IOException {
        String newid = "Signin\n" + username.getText() + "\n" + passvalue.getText();
        try{
        Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port " + 12323);
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF(newid);
            DataInputStream in = new DataInputStream(sock.getInputStream());
            String incoming = in.readUTF();
            if(incoming.startsWith("Mismatch")){
               lbstatus.setText("Incorrect username or password, try again");
            }
            else if(incoming.startsWith("Match")){
                Project.showhome();
            }
            sock.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        //Project.showhome();
    }
    
}

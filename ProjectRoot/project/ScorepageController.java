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


public class ScorepageController implements Initializable {

    @FXML
    private Label SCORE;
    @FXML
    private Button mm;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String name = Accessinguser.getcheck().getusersname().getText();
        try{
            Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port " + 12323);
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF("Wanttoseescore\n" + name);
            DataInputStream in = new DataInputStream(sock.getInputStream());
            String incoming = in.readUTF();
            sock.close();
            SCORE.setText(incoming);
        }catch(Exception e){
            System.out.println("found exception");
        }
        
    }    

    @FXML
    private void backtomm(ActionEvent event) throws IOException {
        Project.showhome();
    }
    
}

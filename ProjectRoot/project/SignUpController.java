
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/*class Info{
    final String USERNAME;
    final String PASSWORD;
    Info(String username, String password){
        USERNAME = username;
        PASSWORD = password;
    }
}*/
public class SignUpController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField passvalue;
    @FXML
    private Button join;
    @FXML
    private Label labstatus;
   

    //public static String user = username.getText();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Accessinguser.getcheck().setusername(username);
    }    

    @FXML
    private void gohome(ActionEvent event) throws IOException {
        String newid = "Signup\n" + username.getText() + "\n" + passvalue.getText();
        try{
        Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port ");
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF(newid);
            DataInputStream in = new DataInputStream(sock.getInputStream());
            String incoming = in.readUTF();
            System.out.println(incoming);
            if(incoming.startsWith("Taken")){
               labstatus.setText("Sorry this username is taken, try again");
               //Project.showsignup();
               //labstatus.setText("Sorry this username is taken, try again");
            }
            else if(incoming.startsWith("Free")){
                //Info here = new Info(username.getText(),passvalue.getText());
                Project.showhome();
            }
            sock.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        //Project.showhome();
    }
}
    


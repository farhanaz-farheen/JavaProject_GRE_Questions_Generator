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


public class HomeController implements Initializable {

    @FXML
    private Button scorebutton;
    @FXML
    private Button easybutton;
    @FXML
    private Button hardbutton;
    @FXML
    private Label welcome;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String name = Accessinguser.getcheck().getusersname().getText();
        welcome.setText("Welcome " + name);
    }    

    @FXML
    private void scorelist(ActionEvent event) throws IOException {
        Project.showscorelist();
    }

    @FXML
    private void easyset(ActionEvent event) throws IOException {
        Project.showeasy();
    }

    @FXML
    private void hardset(ActionEvent event) throws IOException {
        Project.showhard();
    }
    
}

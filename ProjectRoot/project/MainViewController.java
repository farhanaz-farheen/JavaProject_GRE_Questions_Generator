/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import static project.Project.showsignup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MainViewController implements Initializable {
    @FXML
    private Button signup;
    @FXML
    private Button signin;
    //private static Project project;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signupbuton(ActionEvent event) throws IOException {
        Project.showsignup();
    }

    @FXML
    private void signinbutton(ActionEvent event) throws IOException {
        Project.showsignin();
    }
    
}

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

/**
 * FXML Controller class
 *
 * @author User
 */
public class HardlistController implements Initializable {

    @FXML
    private Button mm;
    @FXML
    private Button SINGLE;
    @FXML
    private Button matmcq;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void singleques(ActionEvent event) throws IOException {
        //Project.showhardsingle();
        Project.showhardsinglelist();
    }
    

    @FXML
    private void mathmcq(ActionEvent event) throws IOException {
        Project.showhardmathmcqlist();
    }

    @FXML
    private void backtomm(ActionEvent event) throws IOException {
        Project.showhome();
    }
    
}

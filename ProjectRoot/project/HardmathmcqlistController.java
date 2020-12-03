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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HardmathmcqlistController implements Initializable {

    @FXML
    private Button BACK;
    @FXML
    private Button SET1;
    @FXML
    private Button SET2;
    @FXML
    private Button S3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BACK(ActionEvent event) throws IOException {
        Project.showhard();
    }

    @FXML
    private void SET1(ActionEvent event) throws IOException {
        Project.showhardmathmcq();
    }

    @FXML
    private void SET2(ActionEvent event) throws IOException {
        Project.showhardmathmcq2();
    }

    @FXML
    private void SET3(ActionEvent event) throws IOException {
        Project.showhardmathmcq3();
    }
    
}

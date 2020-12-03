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


public class SingleblanklistController implements Initializable {

    @FXML
    private Button BACK;
    @FXML
    private Button S3;
    @FXML
    private Button S6;
    @FXML
    private Button S2;
    @FXML
    private Button S1;
    @FXML
    private Button S5;
    @FXML
    private Button S4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void S3(ActionEvent event) throws IOException {
        Project.showsingleblank3();
    }

    @FXML
    private void BACK(ActionEvent event) throws IOException {
        Project.showeasy();
    }

    @FXML
    private void S1(ActionEvent event) throws IOException {
        Project.showSINGLEBLANKWINDOW();
    }

    @FXML
    private void S2(ActionEvent event) throws IOException {
        Project.showsingleblank2();
    }

    @FXML
    private void S6(ActionEvent event) throws IOException {
         Project.showsingleblank6();
    }

    @FXML
    private void S5(ActionEvent event) throws IOException {
         Project.showsingleblank5();
    }

    @FXML
    private void S4(ActionEvent event) throws IOException {
         Project.showsingleblank4();
    }

    
}

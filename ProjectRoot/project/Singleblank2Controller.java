package project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.util.Duration;
import project.SignUpController;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Singleblank2Controller implements Initializable {

    @FXML
    private Label Q1;
    @FXML
    private RadioButton op1;
    @FXML
    private RadioButton op2;
    @FXML
    private RadioButton op3;
    @FXML
    private RadioButton op4;
    @FXML
    private RadioButton op5;
    @FXML
    private Label Q2;
    @FXML
    private RadioButton OP1;
    @FXML
    private RadioButton OP2;
    @FXML
    private RadioButton OP3;
    @FXML
    private RadioButton OP4;
    @FXML
    private RadioButton OP5;
    @FXML
    private Label Q3;
    @FXML
    private RadioButton OP31;
    @FXML
    private RadioButton OP32;
    @FXML
    private RadioButton OP33;
    @FXML
    private RadioButton OP34;
    @FXML
    private RadioButton OP35;
    @FXML
    private Label Q4;
    @FXML
    private RadioButton OP41;
    @FXML
    private RadioButton OP42;
    @FXML
    private RadioButton OP43;
    @FXML
    private RadioButton OP44;
    @FXML
    private RadioButton OP45;
    @FXML
    private Label Q5;
    @FXML
    private RadioButton OP51;
    @FXML
    private RadioButton OP52;
    @FXML
    private RadioButton OP53;
    @FXML
    private RadioButton OP54;
    @FXML
    private RadioButton OP55;
    @FXML
    private Label Q6;
    @FXML
    private RadioButton OP61;
    @FXML
    private RadioButton OP62;
    @FXML
    private RadioButton OP63;
    @FXML
    private RadioButton OP64;
    @FXML
    private RadioButton OP65;
    @FXML
    private Label Q7;
    @FXML
    private RadioButton OP71;
    @FXML
    private RadioButton OP72;
    @FXML
    private RadioButton OP73;
    @FXML
    private RadioButton OP74;
    @FXML
    private RadioButton OP75;
    @FXML
    private Label Q8;
    @FXML
    private RadioButton OP81;
    @FXML
    private RadioButton OP82;
    @FXML
    private RadioButton OP83;
    @FXML
    private RadioButton OP84;
    @FXML
    private RadioButton OP85;
    @FXML
    private Label Q9;
    @FXML
    private RadioButton OP91;
    @FXML
    private RadioButton OP92;
    @FXML
    private RadioButton OP93;
    @FXML
    private RadioButton OP94;
    @FXML
    private RadioButton OP95;
    @FXML
    private Label Q10;
    @FXML
    private RadioButton OP101;
    @FXML
    private RadioButton OP102;
    @FXML
    private RadioButton OP103;
    @FXML
    private RadioButton OP104;
    @FXML
    private RadioButton OP105;
    @FXML
    private Label time;
    @FXML
    private Button submit;
    String ans[] = new String[10];
    //private Label score;
    int flag[]=new int[10];
    public int f1 = 0;
    private static final Integer start = 60;
    private Integer timeremain = start;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //int timeremain = 60;
        time.setText(Integer.toString(timeremain));
        Timeline TIME = new Timeline();
        TIME.setCycleCount(Timeline.INDEFINITE);
        TIME.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {
                        timeremain--;
                        time.setText("Remaining time: " + timeremain.toString());
                        if(timeremain<=0){
                            TIME.stop();
                            Accessinguser.getcheck().settime("TimeUP");
                            if(f1==0){
                                try {
                                    scores();
                                    
                                } catch (Exception ex) {
                                    Logger.getLogger(SingleblankwindowController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            try {
                                Project.showsingleans2();
                            } catch (IOException ex) {
                                Logger.getLogger(SingleblankwindowController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                }
        }));
        TIME.playFromStart();
        ans[0]=ans[1]=ans[2]=ans[3]=ans[4]=ans[5]=ans[6]=ans[7]=ans[8]=ans[9]="wrong";
        flag[0]=flag[1]=flag[2]=flag[3]=flag[4]=flag[5]=flag[6]=flag[7]=flag[8]=flag[9]=0;
        String nam = Accessinguser.getcheck().getusersname().getText();
        String message = "Singleblank2\n" + nam;
        try{
        Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port " + 12323);
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            out.writeUTF(message);
            DataInputStream in = new DataInputStream(sock.getInputStream());
            String warning = in.readUTF();
            System.out.println(warning);
            sock.close();
            
            String incoming=null;
            if(warning.contains("4taken")){
                //System.out.println("WHAT IS THIS");
                f1=1;
                Accessinguser.getcheck().setcode("4istaken");
                //Project.showsingleans1();
                Accessinguser.getcheck().settime("ANSWERS:");
                System.out.println("come ON");
                Socket socket2 = new Socket(InetAddress.getLocalHost(),10893);
                DataOutputStream outgoing = new DataOutputStream(socket2.getOutputStream());
                outgoing.writeUTF("4istaken");
                DataInputStream input = new DataInputStream(socket2.getInputStream());
                incoming = input.readUTF();
                socket2.close();
            }
            else if(warning.contains("4free")){
            Accessinguser.getcheck().setcode("4isfree"); 
            Accessinguser.getcheck().settime("ANSWERS:");
            Socket socket2 = new Socket(InetAddress.getLocalHost(),10893);
            DataOutputStream outgoing = new DataOutputStream(socket2.getOutputStream());
            outgoing.writeUTF("4isfree\n" + nam + "4");
            DataInputStream input = new DataInputStream(socket2.getInputStream());
            incoming = input.readUTF();
            socket2.close();
            }
            String info [] = incoming.split("\\$");
            Q1.setText(info[0]);
            Q2.setText(info[6]);
            Q3.setText(info[12]);
            Q4.setText(info[18]);
            Q5.setText(info[24]);
            Q6.setText(info[30]);
            Q7.setText(info[36]);
            Q8.setText(info[42]);
            Q9.setText(info[48]);
            Q10.setText(info[54]);
            
            op1.setText(info[1]);
            op2.setText(info[2]);
            op3.setText(info[3]);
            op4.setText(info[4]);
            op5.setText(info[5]);
            
            OP1.setText(info[7]);
            OP2.setText(info[8]);
            OP3.setText(info[9]);
            OP4.setText(info[10]);
            OP5.setText(info[11]);
            
            OP31.setText(info[13]);
            OP32.setText(info[14]);
            OP33.setText(info[15]);
            OP34.setText(info[16]);
            OP35.setText(info[17]);
            
            OP41.setText(info[19]);
            OP42.setText(info[20]);
            OP43.setText(info[21]);
            OP44.setText(info[22]);
            OP45.setText(info[23]);
            
            OP51.setText(info[25]);
            OP52.setText(info[26]);
            OP53.setText(info[27]);
            OP54.setText(info[28]);
            OP55.setText(info[29]);
            
            OP61.setText(info[31]);
            OP62.setText(info[32]);
            OP63.setText(info[33]);
            OP64.setText(info[34]);
            OP65.setText(info[35]);
            
            OP71.setText(info[37]);
            OP72.setText(info[38]);
            OP73.setText(info[39]);
            OP74.setText(info[40]);
            OP75.setText(info[41]);
            
            OP81.setText(info[43]);
            OP82.setText(info[44]);
            OP83.setText(info[45]);
            OP84.setText(info[46]);
            OP85.setText(info[47]);
            
            OP91.setText(info[49]);
            OP92.setText(info[50]);
            OP93.setText(info[51]);
            OP94.setText(info[52]);
            OP95.setText(info[53]);
            
            OP101.setText(info[55]);
            OP102.setText(info[56]);
            OP103.setText(info[57]);
            OP104.setText(info[58]);
            OP105.setText(info[59]);
            //System.out.println(incoming);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        //Project.showhome();
       
    }
    public void scores() throws Exception{
        int sc = 0;
        if(f1==0){
            if(ans[0].equals("right")&&(flag[0]==0)) sc++;
            if(ans[1].equals("right")&&(flag[1]==0)) sc++;
            if(ans[2].equals("right")&&(flag[2]==0)) sc++;
            if(ans[3].equals("right")&&(flag[3]==0)) sc++;
            if(ans[4].equals("right")&&(flag[4]==0)) sc++;
            if(ans[5].equals("right")&&(flag[5]==0)) sc++;
            if(ans[6].equals("right")&&(flag[6]==0)) sc++;
            if(ans[7].equals("right")&&(flag[7]==0)) sc++;
            if(ans[8].equals("right")&&(flag[8]==0)) sc++;
            if(ans[9].equals("right")&&(flag[9]==0)) sc++;
            String ting = Accessinguser.getcheck().getusersname().getText();
            System.out.println(ting);
            Accessinguser.getcheck().setscore(sc);
            //score.setText("Score is\n" + ting + "\n" + sc);
            Socket sock = new Socket(InetAddress.getLocalHost(),10893);
            System.out.println("connected to server at port " + 12323);
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            String go = "Score is\n" + ting + "\n" + sc;
            out.writeUTF(go);
            sock.close();
        }
    }
    @FXML
    private void op2(ActionEvent event) {
        ans[0] = "right";
    }

    @FXML
    private void OP5(ActionEvent event) {
        ans[1] = "right";
    }

    @FXML
    private void OP31(ActionEvent event) {
        ans[2] = "right";
    }

    @FXML
    private void OP42(ActionEvent event) {
        ans[3] = "right";
    }

    @FXML
    private void OP51(ActionEvent event) {
        ans[4] = "right";
    }

    @FXML
    private void OP61(ActionEvent event) {
        ans[5] = "right";
    }

    @FXML
    private void OP73(ActionEvent event) {
        ans[6] = "right";
    }

    @FXML
    private void OP84(ActionEvent event) {
        ans[7] = "right";
    }

    @FXML
    private void OP95(ActionEvent event) {
        ans[8] = "right";
    }

    @FXML
    private void OP105(ActionEvent event) {
        ans[9] = "right";
    }

    @FXML
    private void op1(ActionEvent event) {
        ans[0] = "wrong";
        flag[0]=1;
    }

    @FXML
    private void op3(ActionEvent event) {
        ans[0] = "wrong";
        flag[0]=1;
    }

    @FXML
    private void op4(ActionEvent event) {
        ans[0] = "wrong";
        flag[0]=1;
    }

    @FXML
    private void op5(ActionEvent event) {
        ans[0] = "wrong";
        flag[0]=1;
    }

    @FXML
    private void OP2(ActionEvent event) {
        ans[1] = "wrong";
        flag[1]=1;
    }

    @FXML
    private void OP3(ActionEvent event) {
        ans[1] = "wrong";
        flag[1]=1;
    }

    @FXML
    private void OP4(ActionEvent event) {
        ans[1] = "wrong";
        flag[1]=1;
    }

    @FXML
    private void OP1(ActionEvent event) {
        ans[1] = "wrong";
        flag[1]=1;
    }

    @FXML
    private void OP32(ActionEvent event) {
        ans[2] = "wrong";
        flag[2]=1;
    }

    @FXML
    private void OP33(ActionEvent event) {
        ans[2] = "wrong";
        flag[2]=1;
    }

    @FXML
    private void OP34(ActionEvent event) {
        ans[2] = "wrong";
        flag[2]=1;
    }

    @FXML
    private void OP35(ActionEvent event) {
        ans[2] = "wrong";
        flag[2]=1;
    }

    @FXML
    private void OP41(ActionEvent event) {
        ans[3] = "wrong";
        flag[3]=1;
    }

    @FXML
    private void OP43(ActionEvent event) {
        ans[3] = "wrong";
        flag[3]=1;
    }

    @FXML
    private void OP44(ActionEvent event) {
        ans[3] = "wrong";
        flag[3]=1;
    }

    @FXML
    private void OP45(ActionEvent event) {
        ans[3] = "wrong";
        flag[3]=1;
    }

    @FXML
    private void OP52(ActionEvent event) {
        ans[4] = "wrong";
        flag[4]=1;
    }

    @FXML
    private void OP53(ActionEvent event) {
        ans[4] = "wrong";
        flag[4]=1;
    }

    @FXML
    private void OP54(ActionEvent event) {
        ans[4] = "wrong";
        flag[4]=1;
    }

    @FXML
    private void OP55(ActionEvent event) {
        ans[4] = "wrong";
        flag[4]=1;
    }

    @FXML
    private void OP63(ActionEvent event) {
        ans[5] = "wrong";
        flag[5]=1;
    }

    @FXML
    private void OP62(ActionEvent event) {
        ans[5] = "wrong";
        flag[5]=1;
    }

    @FXML
    private void OP64(ActionEvent event) {
        ans[5] = "wrong";
        flag[5]=1;
    }

    @FXML
    private void OP65(ActionEvent event) {
        ans[5] = "wrong";
        flag[5]=1;
    }

    @FXML
    private void OP71(ActionEvent event) {
        ans[6] = "wrong";
        flag[6]=1;
    }

    @FXML
    private void OP72(ActionEvent event) {
        ans[6] = "wrong";
        flag[6]=1;
    }

    @FXML
    private void OP74(ActionEvent event) {
        ans[6] = "wrong";
        flag[6]=1;
    }

    @FXML
    private void OP75(ActionEvent event) {
        ans[6] = "wrong";
        flag[6]=1;
    }

    @FXML
    private void OP81(ActionEvent event) {
        ans[7] = "wrong";
        flag[7]=1;
    }

    @FXML
    private void OP82(ActionEvent event) {
        ans[7] = "wrong";
        flag[7]=1;
    }

    @FXML
    private void OP83(ActionEvent event) {
        ans[7] = "wrong";
        flag[7]=1;
    }

    @FXML
    private void OP85(ActionEvent event) {
        ans[7] = "wrong";
        flag[7]=1;
    }

    @FXML
    private void OP91(ActionEvent event) {
        ans[8] = "wrong";
        flag[8]=1;
    }

    @FXML
    private void OP93(ActionEvent event) {
        ans[8] = "wrong";
        flag[8]=1;
    }

    @FXML
    private void OP94(ActionEvent event) {
        ans[8] = "wrong";
        flag[8]=1;
    }

    @FXML
    private void OP92(ActionEvent event) {
        ans[8] = "wrong";
        flag[8]=1;
    }

    @FXML
    private void OP101(ActionEvent event) {
        ans[9] = "wrong";
        flag[9]=1;
    }

    @FXML
    private void OP102(ActionEvent event) {
        ans[9] = "wrong";
        flag[9]=1;
    }

    @FXML
    private void OP103(ActionEvent event) {
        ans[9] = "wrong";
        flag[9]=1;
    }

    @FXML
    private void OP104(ActionEvent event) {
        ans[9] = "wrong";
        flag[9]=1;
    }

    @FXML
    private void SUBMIT(ActionEvent event) throws Exception {
            scores();
            Project.showsingleans2();
    }
        

}

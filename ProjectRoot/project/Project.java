/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Project extends Application {
    private Stage primaryStage;
    @FXML
    private static BorderPane mainpage;
    @Override
    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Project.class.getResource("FirstMain.fxml"));
        mainpage = loader.load();
        FXMLLoader loader1= new FXMLLoader();
        loader1.setLocation(Project.class.getResource("MainView.fxml"));
        BorderPane firstpage= loader1.load();
        mainpage.setCenter(firstpage);
        Scene scene = new Scene(mainpage);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void showsignup() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("SignUp.fxml"));
        GridPane signuppage = Loader.load();
        mainpage.setCenter(signuppage);
    }

    public static void showsignin() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("SignIn.fxml"));
        GridPane signuppage = Loader.load();
        mainpage.setCenter(signuppage);
    }
     public static void showhome() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("Home.fxml"));
        BorderPane signuppage = Loader.load();
        mainpage.setCenter(signuppage);
    }
      public static void showeasy() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easyset.fxml"));
        GridPane easypage = Loader.load();
        mainpage.setCenter(easypage);
    }
      public static void showhard() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardlist.fxml"));
        GridPane easypage = Loader.load();
        mainpage.setCenter(easypage);
    }
       public static void showSINGLEBLANKWINDOW() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleblankwindow.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
       public static void showhardsingle() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingle1.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showsingleblank2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleblank2.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showsingleblank3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("single3.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showsingleblank4() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy4.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showhardsingle3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingle3.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showsingleblank5() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy5.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
        public static void showsingleblank6() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy6.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }public static void showhardsingle2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingle2.fxml"));
        TabPane quespage = Loader.load();
        mainpage.setCenter(quespage);
    }
     public static void showsingleans1() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleblank1ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showsingleans4() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy4ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showsingleans5() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy5ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showsingleans6() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("easy6ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showhardsingleans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingleans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showsingleans2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleans2.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }public static void showhardsingle2ans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingle2ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
    public static void showhardsingle3ans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsingle3ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showsingleans3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("single3ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    }
     public static void showmathmcq1ans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcq1ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } public static void showmathmcq3ans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcq3ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } 
     public static void showmathmcq2ans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcq2ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } 
     public static void showhardmathans() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmathans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } public static void showhardmathans2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmath2ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } public static void showhardmathans3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmath3ans.fxml"));
        TitledPane single = Loader.load();
        mainpage.setCenter(single);
    } 
      public static void showsingle2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleblank2.fxml"));
        TabPane single2 = Loader.load();
        mainpage.setCenter(single2);
    } 
      public static void showmathmcq1() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcq1.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    }public static void showmathmcq3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("MATHMCQ3.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    } public static void showhardmathmcq() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmcq.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    } 
      public static void showmathmcq2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcq2.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    }  public static void showhardmathmcq2() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmath2.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    } public static void showhardmathmcq3() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmath3.fxml"));
        TabPane math1 = Loader.load();
        mainpage.setCenter(math1);
    } 
       public static void showsingleblanklist() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("singleblanklist.fxml"));
        GridPane page = Loader.load();
        mainpage.setCenter(page);
    }public static void showhardmathmcqlist() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardmathmcqlist.fxml"));
        GridPane page = Loader.load();
        mainpage.setCenter(page);
    } 
        public static void showscorelist() throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("scorepage.fxml"));
        GridPane page = Loader.load();
        mainpage.setCenter(page);
    }
        
        public static void showmathmcqlist()throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("mathmcqlist.fxml"));
        GridPane page = Loader.load();
        mainpage.setCenter(page);
    }
        public static void showhardsinglelist()throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(Project.class.getResource("hardsinglelist.fxml"));
        GridPane page = Loader.load();
        mainpage.setCenter(page);
    }
        
    public static void main(String[] args) {
        launch(args);
    }
    
}

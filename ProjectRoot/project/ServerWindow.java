package project;


import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerWindow implements Runnable{
    //private ServerSocket serversock;
    ServerSocket serversock;
    Thread t;
    int port;
    //DataOutputStream out;
    //DataInputStream in;
    ServerWindow(int port) throws IOException{
        t = new Thread(this);
        //ser = server;
        //this.out = out;
        //this.in = in;
        this.port = port;
        //serversock = new ServerSocket(port);
        t.start();
    }
    public void run(){
        //while(true){
        while(true){
            try{ 
                serversock = new ServerSocket(port);
                Socket server = serversock.accept();
                System.out.println("Waiting for client...");
                //Socket server = serversock.accept();
                DataInputStream in = new DataInputStream(server.getInputStream());
                String coming = in.readUTF();
                //System.out.println("\nMessage from client is: " + coming);
                //System.out.println("has been saved in a string");
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                //new signup
                //String coming = in.readUTF();
                if(coming.startsWith("Signup")){
                    System.out.println("ENTERS....");
                    String info[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("users.txt"));
                    int flag=0;
                    while (file.hasNextLine()) {
                        String line = file.nextLine();
                        System.out.println(line);
                        if(line.equals(info[1])) 
                        {
                            flag =1;
                            break;
                        }
                    }
                    //file.close();
                    String h;
                    if(flag==1){
                        h="Taken";
                    }
                    else{
                        h = "Free";
                        System.out.println("come in");
                        try {
                            FileWriter writer = new FileWriter("users.txt", true);
                            BufferedWriter buffered = new BufferedWriter(writer);
                            buffered.write(info[1]);
                            buffered.newLine();
                            buffered.flush();
                            buffered.close();
                            //both
                            FileWriter both = new FileWriter("userspass.txt", true);
                            BufferedWriter buffer = new BufferedWriter(both);
                            buffer.write(info[1] + "+" + info[2]);
                            buffer.newLine();
                            buffer.flush();
                            buffer.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("\nDONE APPENDING");
                    }
                    out.writeUTF(h);
                    System.out.println("signup done");
                }
                else if(coming.startsWith("Signin")){
                    System.out.println("ENTERS Signin...");
                    String info[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("userspass.txt"));
                    int flag=0;
                    while (file.hasNextLine()) {
                        String line = file.nextLine();
                        System.out.println(line);
                        if(line.equals(info[1] + "+" + info[2])) 
                        {
                            flag =1;
                            break;
                        }
                    }
                    //file.close();
                    String h;
                    if(flag==1){
                        h="Match";
                    }
                    else{
                        h = "Mismatch";
                    }
                    out.writeUTF(h);
                    System.out.println("signin done");
                }else if(coming.startsWith("singleblank1")){
                    Scanner file = new Scanner(new FileInputStream("single1ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("hardsingleblank1")){
                    Scanner file = new Scanner(new FileInputStream("hardsingle1ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("hardmath1")){
                    Scanner file = new Scanner(new FileInputStream("hardmath1ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("singleblank3")){
                    Scanner file = new Scanner(new FileInputStream("single3ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("mathmcq1")){
                    Scanner file = new Scanner(new FileInputStream("mathmcq1ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("hardsingleblank2")){
                    Scanner file = new Scanner(new FileInputStream("hardblank2ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("easy4ans")){
                    Scanner file = new Scanner(new FileInputStream("easy4ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("easy5ans")){
                    Scanner file = new Scanner(new FileInputStream("easy5ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("easy6ans")){
                    Scanner file = new Scanner(new FileInputStream("easy6ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("MH2ans")){
                    Scanner file = new Scanner(new FileInputStream("hardmath2ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("MH3ans")){
                    Scanner file = new Scanner(new FileInputStream("hardmath3ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("hardsingle3")){
                    Scanner file = new Scanner(new FileInputStream("hardblank3ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("mathmcq2")){
                    Scanner file = new Scanner(new FileInputStream("mathmcq2ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("mathmcq3")){
                    Scanner file = new Scanner(new FileInputStream("mathmcq3ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("singleblank2")){
                    Scanner file = new Scanner(new FileInputStream("single2ans.txt"));
                    //int flag=0;
                    String line=null;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        
                    }
                    out.writeUTF(line);
                    System.out.println("Message is done");
                    
                }else if(coming.startsWith("EasySingleBlank")){
                    System.out.println("ENTERS Singleblank...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "1")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "1taken";
                    }
                    else mess = "1free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("MH2")){
                    System.out.println("ENTERS math hard 2...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "17")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "17taken";
                    }
                    else mess = "17free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("MH3")){
                    System.out.println("ENTERS math hard 3...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "18")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "18taken";
                    }
                    else mess = "18free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("HardSingle2")){
                    System.out.println("ENTERS hardsingle2...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "15")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "15taken";
                    }
                    else mess = "15free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("HardSingle3")){
                    System.out.println("ENTERS hardsingle3...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "16")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "16taken";
                    }
                    else mess = "16free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Mathmcqhard1")){
                    System.out.println("ENTERS hardmath...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "7")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "7taken";
                    }
                    else mess = "7free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Easy4")){
                    System.out.println("ENTERS easy4...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "11")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "11taken";
                    }
                    else mess = "11free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Easy5")){
                    System.out.println("ENTERS easy5...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "12")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "12taken";
                    }
                    else mess = "12free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Mathmcqeasy3")){
                    System.out.println("ENTERS MATH3...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "14")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "14taken";
                    }
                    else mess = "14free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Easy6")){
                    System.out.println("ENTERS easy6...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "13")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "13taken";
                    }
                    else mess = "13free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("HardSingleBlank")){
                    System.out.println("ENTERS hardSingleblank...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "6")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "6taken";
                    }
                    else mess = "6free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }else if(coming.startsWith("Singleblank3")){
                    System.out.println("ENTERS Singleblank3...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "5")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "5taken";
                    }
                    else mess = "5free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }
                else if(coming.startsWith("1isfree")){
                    System.out.println("entering 1");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("easy1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("14isfree")){
                    System.out.println("entering 14");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("mathmcq3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("11isfree")){
                    System.out.println("entering 11");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("easy4.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("17isfree")){
                    System.out.println("entering 17");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardmath2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("18isfree")){
                    System.out.println("entering 18");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardmath3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("12isfree")){
                    System.out.println("entering 12");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("easy5.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("13isfree")){
                    System.out.println("entering 13");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("easy6.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("15isfree")){
                    System.out.println("entering 15");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardsingle2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("16isfree")){
                    System.out.println("entering 16");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardblank3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("7isfree")){
                    System.out.println("entering 7");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardmath1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("6isfree")){
                    System.out.println("entering 6");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("hardsingle1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("5isfree")){
                    System.out.println("entering 5");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("singleblank3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("4isfree")){
                    System.out.println("entering 1");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("singleblank2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("1istaken")){
                     Scanner file = new Scanner(new FileInputStream("easy1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("14istaken")){
                     Scanner file = new Scanner(new FileInputStream("mathmcq3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("11istaken")){
                     Scanner file = new Scanner(new FileInputStream("easy4.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("12istaken")){
                     Scanner file = new Scanner(new FileInputStream("easy5.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("15istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardsingle2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("17istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardmath2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("18istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardmath3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("16istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardblank3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("13istaken")){
                     Scanner file = new Scanner(new FileInputStream("easy6.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("6istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardsingle1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("7istaken")){
                     Scanner file = new Scanner(new FileInputStream("hardmath1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("5istaken")){
                     Scanner file = new Scanner(new FileInputStream("singleblank3.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("4istaken")){
                     Scanner file = new Scanner(new FileInputStream("singleblank2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("Score is")){
                    String words[] = coming.split("\n");
                    int x = Integer.parseInt(words[2]);
                    FileWriter writer3 = new FileWriter("scores.txt", true);
                    BufferedWriter buffered3 = new BufferedWriter(writer3);
                    buffered3.write(words[1] + " " + Integer.toString(x));
                    buffered3.newLine();
                    buffered3.flush();
                    buffered3.close();
                }else if(coming.startsWith("Wanttoseescore")){
                    int scr = 0;
                    String sc[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("scores.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                                line = file.nextLine();
                                if(line.contains(sc[1])){
                                    String word[] = line.split(" ");
                                    scr = scr + Integer.parseInt(word[1]);
                                }
                                
                            }
                    out.writeUTF("Score is " + scr);
                }else if(coming.startsWith("2isfree")){
                    System.out.println("entering 2");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("mathmcq1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("3isfree")){
                    System.out.println("entering 3");
                    String infos [] = coming.split("\n");
                    FileWriter writer2 = new FileWriter("codeFORuser.txt", true);
                            BufferedWriter buffered2 = new BufferedWriter(writer2);
                            buffered2.write(infos[1]);
                            buffered2.newLine();
                            buffered2.flush();
                            buffered2.close();
                            Scanner file = new Scanner(new FileInputStream("mathmcq2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is over");
                }else if(coming.startsWith("2istaken")){
                     Scanner file = new Scanner(new FileInputStream("mathmcq1.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }else if(coming.startsWith("3istaken")){
                     Scanner file = new Scanner(new FileInputStream("mathmcq2.txt"));
                            //int flag=0;
                            String line=null;
                            while (file.hasNextLine()) {
                            line = file.nextLine();
                            System.out.println(line);
                            }
                    out.writeUTF(line);
                    System.out.println("Message is gone");
                }
                else if(coming.startsWith("Mathmcqeasy1")){
                    System.out.println("ENTERS mathmcqeasy1...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "2")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "2taken";
                    }
                    else mess = "2free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                
                } else if(coming.startsWith("Singleblank2")){
                    System.out.println("ENTERS single2...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "4")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "4taken";
                    }
                    else mess = "4free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                
                } else if(coming.startsWith("Mathmcqeasy2")){
                    System.out.println("ENTERS mathmcqeasy2...");
                    //String info[] = coming.split("\n");
                    String word[] = coming.split("\n");
                    Scanner file = new Scanner(new FileInputStream("codeFORuser.txt"));
                    //int flag=0;
                    String line=null;
                    int f = 0;
                    while (file.hasNextLine()) {
                        line = file.nextLine();
                        System.out.println(line);
                        if(line.contains(word[1] + "3")){
                           f=1; 
                           break;
                        }
                    }
                    String mess;
                    if(f==1){
                        mess = "3taken";
                    }
                    else mess = "3free";
                    out.writeUTF(mess);
                    System.out.println("Message is cleared");
                }
                System.out.println("has been sent to client");
                serversock.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        //}
    }
   public static void main(String [] args)throws IOException{
       //Scanner scan = new Scanner(System.in);
       int prt = 10893;
       System.out.println(InetAddress.getLocalHost());
       //ServerSocket serversock;
       //serversock = new ServerSocket(prt);
       //while(true){
       //Socket server = serversock.accept();
       
        /*DataInputStream input = new DataInputStream(server.getInputStream());
                String coming = input.readUTF();
                //System.out.println("\nMessage from client is: " + coming);
                //System.out.println("has been saved in a string");
                DataOutputStream output = new DataOutputStream(server.getOutputStream());
                //new signup*/
       //try{
                
           ServerWindow t = new ServerWindow(prt);
       
       //}catch(IOException e){
         //  e.printStackTrace();
       //}
       //}
   }
}

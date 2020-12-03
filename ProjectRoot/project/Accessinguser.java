
package project;

import javafx.scene.control.TextField;

public class Accessinguser {
    private static Accessinguser checking = new Accessinguser();
        public static Accessinguser getcheck(){
            return checking;
        }
        private String time;
        private TextField usersname;
        private int score;
        private String code;

        public TextField getusersname() {
           return usersname;
        }

       public void setusername(TextField name) {
           this.usersname = name;
       }
       public int getscore() {
           return score;
        }

       public void setscore(int score) {
           this.score = score;
       }
        public String getcode() {
           return code;
        }

       public void setcode(String code) {
           this.code = code;
       }
       public String gettime() {
           return time;
        }

       public void settime(String TIME) {
           this.time = TIME;
       }
}

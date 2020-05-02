
package procesos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proceso1 {

    public static void main(String[]args){
        ProcessBuilder proceso1 = new ProcessBuilder("NOTEPAD.EXE");
        try {
            proceso1.start();
        } catch (IOException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

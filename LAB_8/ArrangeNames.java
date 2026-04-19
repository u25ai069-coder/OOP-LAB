package LAB_8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArrangeNames {
    public static void main(String[] args) {
    
        File f = null;
        FileReader fr = null; 

        try {

            f = new File("C:\\Users\\Geet Lahoty\\Desktop\\OOP_lab\\LAB_8\\Names.txt");
            fr = new FileReader(f);

            System.out.println("Length : " + f.length());

            char all[] = new char[(int)f.length()];

            fr.read(all, 0, (int)f.length());

            
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

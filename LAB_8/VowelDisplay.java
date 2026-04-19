package LAB_8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VowelDisplay {
    public static void main(String[] args) {
        
        File f = null;
        FileReader fr = null; 

        try {

            f = new File("C:\\Users\\Geet Lahoty\\Desktop\\OOP_lab\\LAB_8\\sampleText.txt");
            fr = new FileReader(f);

            System.out.println("Length : " + f.length());

            char all[] = new char[(int)f.length()];

            fr.read(all, 0, (int)f.length());

            for (int i=0; i<(int)f.length(); i++)
            {
                if (all[i] == 'a' || all[i] == 'e' || all[i] == 'i' || all[i] == 'o' || all[i] == 'u')
                {
                    System.out.println("Found : '" + all[i] + "' at pos " + i);
                }
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package LAB_8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HisToHer {
    public static void main(String[] args) {
        
        File f = null;
        FileReader fr = null;
        FileWriter fw = null;

        try {

            f = new File("C:\\Users\\Geet Lahoty\\Desktop\\OOP_lab\\LAB_8\\sampleText.txt");
            fr = new FileReader(f);

            int length = (int)f.length();

            char[] content = new char[length];

            fr.read(content, 0, length);

            for (int i=0; i<length-2; i++) {

                if (content[i] == 'h' && content[i+1] == 'i' && content[i+2] == 's') {

                    content[i+1] = 'e';
                    content[i+2] = 'r';
                    i+=2;
                }
            }

            fw = new FileWriter(f);

            fw.write(content, 0, length);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package LAB_8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BetweenStringThe {
    public static void main(String[] args) {

        File f = null;
        FileReader fr = null; 

        try {

            f = new File("C:\\Users\\Geet Lahoty\\Desktop\\OOP_lab\\LAB_8\\sampleText.txt");
            fr = new FileReader(f);

            System.out.println("Length : " + f.length());

            char all[] = new char[(int)f.length()];

            fr.read(all, 0, (int)f.length());

            String temp = new String(all);
            temp = temp.toLowerCase();

            int firstIndex = temp.indexOf("the");
            int lastIndex = temp.lastIndexOf("the");

            if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex)
            {
                String copied = temp.substring(firstIndex + 4, lastIndex);

                System.out.println("Copied : " + copied);
            }
            else
            {
                System.out.println("Could not find two the");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}

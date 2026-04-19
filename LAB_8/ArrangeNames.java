package LAB_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ArrangeNames {
    public static void main(String[] args) {
    
        File f = null;
        FileReader fr = null; 

        try {

            f = new File("C:\\Users\\Geet Lahoty\\Desktop\\OOP_lab\\LAB_8\\Names.txt");
            fr = new FileReader(f);

            String[] names = new String[10];

            BufferedReader reader = new BufferedReader(fr);

            for (int i=0; i<10; i++) {
                names[i] = reader.readLine().trim();
            }
            reader.close();

            String[] changedNames = new String[10];

            for (int i=0; i<10; i++) {

                if (names[i].length() > 3) {
                    changedNames[i] = names[i].substring(3);
                }
                else {
                    changedNames[i] = "";
                }
            }

            System.out.println("Orignal -> changed \n");

            for (int i=0; i<10; i++) {

                System.out.println(i+1 + ". " + names[i] + " -> " + changedNames[i]);
            }

            Arrays.sort(changedNames);

            System.out.println("\nSorted changed names: \n");
            
            for (int i=0; i<10; i++) {

                System.out.println(i+1 + ". " + changedNames[i]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

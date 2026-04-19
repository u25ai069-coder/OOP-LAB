package LAB_8;

import java.util.Scanner;

public class UppercaseCharacter { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Line: ");
        String input = sc.nextLine();

        char[] st = input.toCharArray();

        st[0] = Character.toUpperCase(st[0]);

        for (int i=1; i<input.length()-1; i++) {

            if (st[i] == ' ') {

                st[i+1] = Character.toUpperCase(st[i+1]);
            }      
        }

        String output = new String(st);

        System.out.println("Changed String : " + output);

        sc.close();
    }
}

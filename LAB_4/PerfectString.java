package LAB_4;

import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String st = sc.next();

        int freq[] = new int[26];

        for (int i=0; i<st.length(); i++)
        {
            freq[st.charAt(i)-97]++;
        }

        for (int i=0; i<26; i++)
        {
            if (freq[i] > 1)
            {
                System.out.println("Not a perfect string");
                sc.close();
                return;
            }
        }

        System.out.println("Is a perfect string");

        sc.close();
    }
}
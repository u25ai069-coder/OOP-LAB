package LAB_4;

import java.util.Scanner;

public class FrequencyChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String st = sc.next();

        int freq[] = new int[26];

        for (int i=0; i<st.length(); i++)
        {
            freq[st.charAt(i)-97]++;
        }

        System.out.print("Find frequency to search: ");
        int f = sc.nextInt();

        System.out.println("Characters with greater frequency than " + f + " :");
        for (int i=0; i<26; i++)
        {
            if (freq[i] >= f)
            {
                System.out.println("Frequency of '" + (char)(97+i) + "' is " + freq[i]);
            }
        }

        sc.close();

    }
}

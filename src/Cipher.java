// Noah TerBest
// CSC 1060

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        //Parallel Arrays
        char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // Wasn't sure how to make it possible for the user to choose an encryption like your example, is that possible
        // with parallel arrays?

        char cipher[] = {'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k','l', 'm', 'n', 'o', 'p', 'q','r', 's' , 't', 'u', 'v', 'w'};

        Scanner scanner = new Scanner(System.in);

        // Prompt user for message
        System.out.print("Enter message to encrypt: ");
        String plaintext = scanner.nextLine();
        String ciphertext = "";


        // Encrypt message
        for (int i = 0; i < plaintext.length(); i++) {

            char letter = plaintext.charAt(i);
            int index = -1;

            for (int j = 0; j < alphabet.length; j++) {
                // Find index of letter in alphabet
                if (letter == alphabet[j]) {
                    index = j;
                }
            }
            // Check if letter is in alphabet
            if (index!= -1) {
                // Encrypt letter
                ciphertext += cipher[index];
            }else {
                // If letter is not in alphabet, leave it
                ciphertext += letter;
            }
        }

        //Print ciphertext message
        System.out.println(ciphertext);
    }
}
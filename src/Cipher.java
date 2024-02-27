// Noah TerBest
// CSC 1060

public class Cipher {
    public static void main(String[] args) {

        // Parallel arrays
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] shifted = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'};

        // Variables
        String plaintext = "hello how are you";
        String ciphertext = "";

        // Loop through plaintext
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            int index = ch - 'a';
            char shiftedChar = shifted[index];
            ciphertext += shiftedChar;
        }

        System.out.println(ciphertext);

    }
}
package sistecredito.retofalabella.utils;

import java.util.Random;

public class RandomProduct {

    public static String generateString(){
        String alphabet =Constants.ALPHABET;

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 9;

        for (int i = 0; i < length; i++){
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;

    }
}

import java.util.Random;
import java.util.Scanner;

public class PronounceableGibberish { //Generates a random (hopefully) pronounceable word
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many characters?");
        int num = in.nextInt();
        StringBuilder out = new StringBuilder();
        in.close();
        char[] empty = {};
        char[] end = {'i','u','v','j'};
        //char[]
        for (int i = 0; i <= num; i++) {
            out.append(randChar(empty));
        }
        System.out.println(out);
    }

    private static char randChar(char[] exclude) {
        Random rand = new Random();
        while (true) {
            char out;
            int c = rand.nextInt(26);
            out = "abcdefghijklmnopqrstuvwxyz".charAt(c);
            for (int i = 0; i <= exclude.length; i++) {
                if (out != exclude[i]) {
                    return out;
                }
            }
        }
    }

}

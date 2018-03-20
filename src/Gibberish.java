import java.util.Scanner;
import java.util.Random;

public class Gibberish { //Generates a random string of characters
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many characters?");
        int num = in.nextInt();
        in.close();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder out = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i <= num; i++) {
            int c = rand.nextInt(chars.length());
            out.append(chars.charAt(c));
        }
        System.out.println(out);
    }
}

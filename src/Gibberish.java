import java.util.Scanner;

public class Gibberish { //Generates a random string of characters //Note: untested
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many characters?");
        int num = in.nextInt();
        in.close();
        String[] chars = "abcdefghijklmnopqrstuvwxyz".split("");
        String out = "";
        for (int i = 0; i>=num;i++) {
            out += chars[(int) Math.round(Math.random()*chars.length)];
        }
        System.out.println(out);
    }
}

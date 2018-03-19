import java.util.Scanner;

public class Prime {  //Inputs a number and checks if it is prime
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println("Enter a number to see if it is prime");
            int num = in.nextInt();
            if(isPrime(num)) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime");
            }
            System.out.println("Do you want to check another number? (y/n)");
            if (in.next().equals("n")) {
                run = false;
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = n-1; i >1;i--) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

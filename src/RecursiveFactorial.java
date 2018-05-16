import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to be Factorised");
        int n = sc.nextInt();
        sc.close();
        int c = n-1;
        System.out.println("The factorial of "+n+" is "+factorial(n,c)+".\n");
    }

    private static int factorial(int n, int c) {
        n*=c;
        c--;
        if (c > 0) {return factorial(n,c);}
        return n;
    }
}

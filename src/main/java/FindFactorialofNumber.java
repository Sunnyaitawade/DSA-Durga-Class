import java.util.Scanner;

public class FindFactorialofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no number for factorial?");
        int n=scanner.nextInt();
        System.out.println("Using Loop::"+usingForLoop( n));
        System.out.println("Using Recursion::"+usingRecursion( n));
    }
    public static int usingForLoop(int n){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }
        return fact;
    }

    public static int usingRecursion(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*usingRecursion(n-1);
        }
    }
}

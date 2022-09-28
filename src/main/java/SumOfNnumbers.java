import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        System.out.println("Enter the limit to add nth number addition");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("using loop::"+usingLoop(n));
        System.out.println("using recursion::"+usingRecursion(n));
        System.out.println("using Formula::"+usingFormula(n));
    }
    public static int usingLoop(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
       return sum;

    }
    public static int usingRecursion(int n){
         if(n==0){
             return 0;
         }else{
             return n+usingRecursion(n-1);
         }

    }
    public static int usingFormula(int n){
        return (n*(n+1))/2;
    }

}

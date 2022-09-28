import java.util.Scanner;

public class CountDigitInNumber {
    public static void main(String[] args) {

        System.out.println("Enter no ::");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println("Total No of digits::"+countDigit(n));
    }
    public static int countDigit(int n){
        int count =0;
        while (n%10!=0){
            n=n/10;
            count++;
        }
        return count;
    }

}

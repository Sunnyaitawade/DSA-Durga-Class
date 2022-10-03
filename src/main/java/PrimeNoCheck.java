import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {
        System.out.println("Enter no which need to be check as prime?");
        Scanner scanner= new Scanner(System.in);
        int no= scanner.nextInt();
        System.out.println("Using for loop No is:: "+isPrimeUsingLoop(no));
        System.out.println("Using recrusrsion No is:: "+isPrimeUsingRecursion(no,no/2));
    }

    public static boolean isPrimeUsingLoop(int no){
        int primecount=0;
        for (int i = 1; i <=no ; i++) {
            if(no%i==0){
                primecount++;
            }

        }
        return primecount==2?true:false;
    }

    public static boolean isPrimeUsingRecursion(int no,int i)
    {
        if(i==1)
            return true;
        else if(no%i==0)
            return false;
        else return isPrimeUsingRecursion(no,--i);
    }

}

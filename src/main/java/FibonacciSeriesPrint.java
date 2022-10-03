import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeriesPrint {
    public static void main(String[] args) {
        System.out.println("Enter how many no of fibboncci print?");
        Scanner scanner= new Scanner(System.in);
        int no= scanner.nextInt();
        System.out.println("Using for loop No is:: "+getFibboncciSeries(no));
    }
    public static  List<Integer> getFibboncciSeries(int no){
        int a=0;
        int b=1;
        List<Integer> ans= new ArrayList<>();

        for (int i = 1; i <=no-2 ; i++) {
            int c=a+b;
            ans.add(c);
            a=b;
            b=c;
        }
        return ans;
    }
}

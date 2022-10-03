import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TribonancciSeriesNumber {

    public static void main(String[] args) {
        System.out.println("Enter how many no of Triboncci print?");
        Scanner scanner= new Scanner(System.in);
        int no= scanner.nextInt();
        System.out.println("Using for loop No is:: "+getTriboncciSeries(no));
    }
    public static List<Integer> getTriboncciSeries(int no){
        int a=0;
        int b=1;
        int c=2;
        List<Integer> ans= new ArrayList<>();

        for (int i = 0; i <=no-3 ; i++) {
            int d=a+b+c;
            ans.add(d);
            a=b;
            b=c;
            c=d;
        }
        return ans;
    }
}

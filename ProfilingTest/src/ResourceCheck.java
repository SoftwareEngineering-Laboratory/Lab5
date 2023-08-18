import java.util.ArrayList;
import java.util.List;

public class ResourceCheck {

    public static void main(String[] args) {
        calculateSum(1000000);
        calculateSum(2000000);
        calculateSum(3000000);
    }

    public static long calculateSumToN(int n){
        long sum =0;
        for (int i=0;i<=n;i++)sum+=i;
        return sum;
    }
    public static void calculateSum(int n) {
        ArrayList<Long> sums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long sum = calculateSumToN(i);
            sums.add(sum);
        }
        long sum=0;
        for (int i=0;i<n;i++)sum+=sums.get(i);
        System.out.println("Sum: " + sum);
    }


}
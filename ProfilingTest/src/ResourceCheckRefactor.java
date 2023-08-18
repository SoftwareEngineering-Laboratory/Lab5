import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResourceCheckRefactor {
    
    public static int max = 3000001;
    public static long[] sums = new long[max];
    public static void main(String[] args) throws InterruptedException {
        preprocess();
        calculateSum(1000000);
        calculateSum(2000000);
        calculateSum(3000000);
        Thread.sleep(10000);
    }

    public static void preprocess(){
        sums[0]=0;
        for (int i=1;i<max; i++){
            sums[i]=sums[i-1]+i;
        }
    }
    public static long calculateSumToN(int n){
        return sums[n];
    }
    public static void calculateSum(int n) {
        long sum=0;
        for (int i=0;i<n;i++)sum+=calculateSumToN(i);
        System.out.println("Sum: " + sum);
    }

}

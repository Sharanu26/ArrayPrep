import java.util.Arrays;
import java.util.Scanner;

public class funcOptimization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
         for(int i =0;i<n;i++){
             arr[i] = sc.nextInt();
         }
        Arrays.sort(arr);
         int minFuncValue = Integer.MAX_VALUE;
         for(int i =0;i<n-m;i++){
             int currFucValue = arr[i+m-1]-arr[i];
             if(currFucValue < minFuncValue){
                 minFuncValue = currFucValue;
             }
         }
        System.out.println(minFuncValue);
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class maxProdSubArray {
    static int maxProduct(int[] arr,int n){
        int cprod =1;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            cprod *= arr[i];
            if(cprod > max){
                max = cprod;
            }
            if(arr[i] ==0){
                cprod =1;
            }
        }
        cprod =1;
        for(int i=n-1;i>=0;i--){
            cprod *= arr[i];
            if(cprod > max){
                max = cprod;
            }
            if(arr[i] ==0){
                cprod =1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr,arr.length));
    }

}

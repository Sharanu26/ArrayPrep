import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static int SubEk(int[] arr,int k){
        HashMap<Integer,Integer> fmap = new HashMap<>();
        int n = arr.length;
        int sum =0;
        fmap.put(0,1);
        int cnt =0;

        for(int i=0;i<n;i++){
            sum += arr[i];
            int rem = sum-k;
            if(fmap.containsKey(rem)){
                cnt += fmap.get(rem);
            }
            fmap.put(sum, fmap.getOrDefault(sum,0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SubEk(arr,k));
    }
}

import java.util.Scanner;

public class SmallerSubArraySumGreaterThanX {
    public static int SubArrayGretX(int[] arr,int x){
        int n = arr.length;
        int i=0;
        int j=0;
        int sum=0;
        int ans = Integer.MAX_VALUE;

        while(j<n) {
            sum += arr[j];

            while (sum > x) {
                ans = Math.min(ans, j - i + 1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SubArrayGretX(arr,x));
    }
}

public class countOccur {

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,8,8,6,5};
        int n = 8,x=8;
        int ans = count(arr,n,x);
        System.out.println(ans);

    }

    public static int count(int[] arr, int n, int x){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i] == x) cnt++;
        }
        return cnt;
    }
}

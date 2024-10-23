

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class majorityElm2 {
    public static int MajorityElem2(int[] arr,int k,int n){

        Map<Integer, Integer> fmap = new HashMap<>();
        int cnt=0;
        int x=n/k;

        for(int i=0;i<n;i++){
            fmap.put(arr[i], fmap.getOrDefault(arr[i],0) +1 );
            if(fmap.get(arr[i]) > x){
                cnt++;
                fmap.put(arr[i], -9999);
            }

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        System.out.println(MajorityElem2(arr,k,arr.length));
    }

}



import java.util.Scanner;

public class MajorityElement {
    public static int majorityElem(int[] arr){
        int n = arr.length;
        int ans=0;
        int cnt=0;

        for(int i=0;i<n;i++){
            if(cnt ==0){
                ans=arr[i];
            }
            if(ans == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElem(arr));

    }



}
package ArrayQuestion;

import java.util.Arrays;

class TwoSumOptimal {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target  = 14;
        int n = arr.length;
        int ans = Twosum(arr, n, target);
        System.out.println(ans);

    }
    public static int Twosum(int[] arr, int n, int target){
        Arrays.sort(arr);
        int left =0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return 0;
            }else if(sum<target) return left++;
            else return right--;
        }
        return 1;
    }
}

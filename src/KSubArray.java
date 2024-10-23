import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class KSubArray {
    static ArrayList<Integer> printMax(int arr[],int n ,int k){
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int i =0;
        int j=0;

        while(j<n){
            while(deque.size() > 0 && deque.getLast() < arr[j]){
                deque.pollLast();
            }
            deque.addLast(arr[j]);

            if(j-i+1 == k) {
                ans.add(deque.getFirst());

                if (deque.getFirst() == arr[i]) {
                    deque.pollFirst();
                }
                i++;
            }
            j++;
        }
        return ans;
    }

        public static void main (String[]args){
            int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
            int k = 3;
            System.out.println(printMax(arr, arr.length, k));

        }
    }


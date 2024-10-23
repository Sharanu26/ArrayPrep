import java.util.Scanner;

public class duplicateNumber {
    public static int duplcateNo(int[] arr) {
        int n = arr.length;
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while (slow != fast);
        fast = arr[0];

        while (fast != slow) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(duplcateNo(arr));
    }
}

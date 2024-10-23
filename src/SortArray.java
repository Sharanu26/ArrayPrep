import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int low = 0;
        int mid =0;
        int high = n-1;

        while(mid <= high){
            int num = arr[mid];
            if(num==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(num==1){
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }


    }
}

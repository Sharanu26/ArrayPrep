import java.util.Scanner;

public class BestTimeToBuyII {
    public static int BstTimeToSell(int[] price){
        int n = price.length;
        int sellDate = 0;
        int buyDate =0;
        int profit =0;

        for(int i=1;i<n;i++){
            if(price[i] >= price[i-1]){
                sellDate++;
            }else{
                profit += price[sellDate] - price[buyDate];
                sellDate = buyDate = i;
            }

        }
        profit += price[sellDate] - price[buyDate];
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(BstTimeToSell(arr));
    }
}

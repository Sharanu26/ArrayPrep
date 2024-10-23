import java.util.Scanner;

public class BestTimeToBuy {
    public static int BestStock(int[] prices){
        int n = prices.length;
        int msf = prices[0];
        int maxProfit = 0;

        for(int i =0;i<n;i++){
            if(prices[i] < msf){
                msf = prices[i];
            }
            int profit = prices[i] - msf;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(BestStock(arr));
    }
}

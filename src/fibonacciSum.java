import java.util.Scanner;

public class fibonacciSum {
    public static int FibonacciSum(int m,int n){
        int sum =0;
        int a =0;
        int b=1;
        while(a<=n){
            if(a>=m){
                sum+=a;
            }
            int temp = a;
            a=b;
            b=temp +b;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = FibonacciSum(m,n);
        System.out.println("sum of fibonacci sum "+m+" to "+n+" is "+ result);

    }
}

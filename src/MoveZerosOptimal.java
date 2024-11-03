package ArrayQuestion;

class MoveZerosOptimal {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n =10;
        int[] ans = MoveZerosEnd(n,arr);
        for(int i=0;i<n;i++){
            System.out.println(ans[i] + " ");
        }
        
    }
    public static int[] MoveZerosEnd(int n, int[]a){
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return a;
        for(int i=j+1;i<n;i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    
}

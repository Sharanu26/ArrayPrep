package ArrayQuestion;

class LeftRotateOptimal {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int n = arr.length;
        LeftRotate(arr, n);
    }
    public static void LeftRotate(int[] arr,int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}

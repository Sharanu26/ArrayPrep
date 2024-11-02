package ArrayQuestion;
class NumberAppearOnceOptimal {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans =AppearOnceAt(arr);
        System.out.println("the number that appaears once: "+ ans);

    }
    public static int AppearOnceAt(int[] arr){
        int n = arr.length;
        int Xorr =0;

        for(int i=0;i<n;i++){
            Xorr = Xorr ^ arr[i];
        }
        return Xorr;
    }
    
}

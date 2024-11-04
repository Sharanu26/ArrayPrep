package ArrayQuestion;

class MaxConsecutiveOnes {
    public static int maxConsecutive(int[] arr){
        int count=0;
        int max1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }else{
            count = 0;
            }
            max1 = Math.max(max1,count);
        }
        return max1;
        
    }
    public static void main(String[] args){
        int arr[] ={1,1,0,1,1,1};
        int ans = maxConsecutive(arr);
        System.out.println("maximum consecutive numbber is:  "+ ans );
    }
}
    


public class maxSubArray {
    public static int maxSub (int arr[]) {
    //method 1
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                currSum=0;
                for(int k=i;k<j;k++) {
                    currSum+=arr[i];
                }   if(currSum > max) {
                    max=currSum;
                }
            }
        } return max;
    }
//using kadanes algorithm
    static int kadanes (int arr[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            currSum+=arr[i];
            maxSum=Math.max(currSum, maxSum);
            if(currSum < 0) {
                currSum=0;
            } 
        } return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println(maxSub(arr));
        // System.out.println(kadanes(arr));

    }
}

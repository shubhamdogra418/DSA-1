public class maxDiff {
    static int maximumDifference(int[] nums) { //brute force O(n2)
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[j] > nums[i]) {
                    int diff= nums[j]-nums[i];
                    max=Math.max(diff,max);
                } 
            } 
        } return max;
    }

    static int maxDiffOp (int arr[]) { //O(n)
        int min=arr[0];
        int diff=-1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > min) {
                diff=Math.max(diff, arr[i]-min);
            } else {
                min=arr[i];
            }
        } return diff;
    }
//121. Best Time to Buy and Sell Stock
    static int buySell (int prices[]) { //O(n)
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > min) {
                profit=Math.max(profit, prices[i]-min);
            } else {
                min=prices[i];
            }
        } return profit;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,10};
        int prices[]={7,1,5,3,6,4};
        System.out.println(maximumDifference(arr));
        System.out.println(maxDiffOp(arr));
        System.out.println(buySell(prices));
    }
}

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
    public static void main(String[] args) {
        int arr[]={1,5,2,10};
        System.out.println(maximumDifference(arr));
        System.out.println(maxDiffOp(arr));
    }
}

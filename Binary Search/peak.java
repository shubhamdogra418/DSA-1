public class peak {
//peak element
    static int peakEl (int arr[]) { //O(n)
        int max=0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] > max) {
                max=arr[i];
            }
        } return max;
    }
//using binary search
    static int peakBinary (int arr[]) {
        int low=0;
        int high=arr.length-1;
        while(low <= high) {
            int mid= low+ (high-low)/2;
            if(arr[mid] > arr[mid+1]) {
                high=mid;
            } else {
                low=mid+1;
            }
        } return high;
    }
//repeating elements
    static int repeatEl (int nums[]) {
        for (int i=1;i<nums.length-1;i++) {
            if(nums[i-1]==nums[i]) {
                return nums[i];
            }
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,10,20,15,7};
        // System.out.println(peakEl(arr));   
        // System.out.println(peakBinary(arr));
        int nums[]={0,2,1,3,2,2};
        System.out.println(repeatEl(nums));
    }
}

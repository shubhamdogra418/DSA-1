public class lowerBound {
    static int lowerB (int arr[], int target) {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low <= high) {
            int mid=low+ (high-low)/2;
            if(arr[mid] > target) {
                // ans=mid; //upper bound
                high=mid-1;
            } else {
                ans=mid; //lower bound
                low=mid+1;
            } 
        } return ans;
    }
//34. Find First and Last Position of Element in Sorted Array
    static int[] firstLast (int arr[],int target) {
        int start=-1;
        int last=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                start=i;
                break;
            }  else {
                start=-1;
            }
        } if(start ==-1) { //if at start not found,means not exist, if found surely ans
            return new int[] {-1,-1};
        }
        for(int j=arr.length-1; j>=0;j--) {
            if(arr[j]==target) {
                last=j;
                break;
            } else {
                last=-j;
            } 
        }  return new int [] {start, last};
    }
    public static void main(String[] args) {
        int arr[]={1,2,8,10,11,12,19};
        System.out.println(lowerB(arr, 5));
        int nums[]={5,7,7,8,8,10};
        System.out.println(firstLast(arr, 8));
    }
}

public class insertPos {
    static int insertPosition (int arr[],int target) {
        int low=0;
        int high=arr.length-1;
        // int ans=-1;
        while(low <= high) {
            int mid=low+ (high-low)/2;
            if (arr[mid] < target) {
                // ans=low;
                low=mid+1;
            } else if(arr[mid] > target) {
                high=mid-1;
            } else {
                return mid;
            }
        } return low;
    }
//using linear search
    static int insertLinear (int arr[], int target) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==target) {
                return i;
            } if (arr[i] > target) {
                return i;
            }
        } return -1;
    }


    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println(insertPosition(arr, 2));    
        System.out.println(insertLinear(arr, 2));
    }
}

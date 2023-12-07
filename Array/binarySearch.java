class binarySearch {
    public static int binarySearch (int arr[],int target) {
        int low=0;
        int high=arr.length;
        while (low <= high) {
            int mid= low+ (high-low)/2;
            if(target > arr[mid]) {
                low=mid+1;
            } else if (target < arr[mid]) {
                high=mid-1;
            } else {
                return mid;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,19,25};
        int target=19;
        System.out.println("Target found at index no.: "+binarySearch(arr, target));


    }
}
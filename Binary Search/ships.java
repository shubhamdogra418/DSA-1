public class ships {
    static int minShip (int arr[],int days) {
        int maxWt=0;
        int totalWt=0;
        for(int i=0;i<arr.length;i++) {
           maxWt=Math.max(maxWt, arr[i]);
           totalWt=totalWt+arr[i];
        } 
        int low=maxWt; 
        int high=totalWt;
        while (low < high) {
            int mid=low+ (high-low)/2;
            int count=1;
            int currentWt=0;
            for(int i=0;i<arr.length;i++) {
                if(currentWt + arr[i] > mid) {
                    count++;
                    currentWt=0;
                } currentWt+=arr[i];
            } if(count > days) {
                low=mid+1;
            } else {
                high=mid;
            }
        } return low;
    }
    public static void main(String[] args) {
        int arr[]={3,2,2,4,1,4};
        System.out.println(minShip(arr, 5));
    }
}

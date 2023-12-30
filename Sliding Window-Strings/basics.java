
public class basics {
    static int findMaxBrute (int arr[]) {
        int max=0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j] > max) {
                    max=arr[i]+arr[j];
                }
            }
        } return max;
    }

    static int findMax( int arr[]) {
        int max=0;
        for(int i=1;i<arr.length;i++) { //O(n)
            if(arr[i] + arr[i-1] > max) {
                max= arr[i] + arr[i-1];
            }
        } return max;
    }

//sliding window maximum
    static int slidingWindow ( int arr[], int k) { //O(n)
        int window_max=0;
        for (int i=0;i<k;i++) {
            window_max+=arr[i];
        } 
        int max=0;
        for(int i=k;i<arr.length;i++) {
            window_max+= arr[i] -arr[i-k];
            max=Math.max(window_max,max);
        } return max;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        System.out.println(findMaxBrute(arr));
        System.out.println(findMax(arr));
        System.out.println(slidingWindow(arr, 2));

    }
}

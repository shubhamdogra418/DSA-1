public class secondLargest {
    public static int secondL (int arr[]) {
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max1) {
                max2=max1;
                max1=arr[i];
            }
        } return max2;
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,7,8,10};
        System.out.println(secondL(arr));
    }
}

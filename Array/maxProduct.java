public class maxProduct {
//TC- O(n2)
    public static int maxProductIs (int arr[]) {
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int currmax= ((arr[i]-1)*(arr[j]-1));
                if(currmax > max) {
                    max=currmax;
                }
                Math.max(currmax,max);
            }
        } return max;
    }

//optimised solution -O(n)
    public static int maxProductOp (int arr[]) {
        int max1=0;
        int max2=0;
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i] >= max1) {
                max2=max1;
                max1=arr[i];
            } else if ( arr[i] > max2) {
                max2=arr[i];
            }
        } return (max2-1) * (max1-1);
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        System.out.println(maxProductIs(arr));
        System.out.println(maxProductOp(arr));

    }
}

import java.util.Arrays;

public class maxProdDiff {
//1913. Maximum Product Difference Between Two Pairs
    static void maxProductDiff(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int result= (arr[n-1]*arr[n-2])-(arr[0]*arr[1]);
        System.out.println(result); 
    }

//optimised approach
    static int maxProductDiffOp(int arr[]) {
        int max1=0;
        int max2=0;
        int min1=Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) { //O(n)
            if(arr[i]>max1) {
                max2=max1;
                max1=arr[i];
            } else if (arr[i] > max2) {
                max2=arr[i];
            } 
            
            if(arr[i] < min1) {
                min2=min1;
                min1=arr[i];
            } else if (arr[i] < min2) {
                min2=arr[i];
            }
        } 
        int maxMul=max1*max2;
        System.out.println(max1+" maxs "+max2);
        int minMul=min1*min2;
        System.out.println(min1+ " mins "+ min2);
        return maxMul-minMul;
        
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,9,7,4,8};
        // maxProductDiff(arr);
        System.out.println(maxProductDiffOp(arr));
    }
}

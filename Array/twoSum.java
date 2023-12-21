import java.util.*;
public class twoSum {
    static int[] twoSumm(int arr[],int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==target) {
                    return new int [] {i,j};
                }
            }
        } return new int [] {};
    }

    static int[] twoSumOp (int arr[], int target) {
        int res=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]+arr[res]==target) {
                return new int[] {i,res};
            } else {
                res++;
            }
        } return new int[] {};
    }

    static int[] twoSumMap (int arr[],int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int ans=target-arr[i];
            if(map.containsKey(ans)) {
                return new int[] {map.get(ans), i};
            }
            map.put(arr[i], i);
        } return new int [] {};

    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(twoSumm(arr, 9));
        System.out.println(twoSumOp(arr, 9));
        System.out.println(twoSumMap(arr, 9));
    }
}

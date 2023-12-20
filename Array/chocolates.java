import java.util.*;

public class chocolates {
    static int minChoco (int arr[], int money) { //O(n)
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]< min1) {
                min2=min1;
                min1=arr[i];
            } else if(min2 > arr[i]) {
                min2=arr[i];
            }
        } int result= min1+min2;
        if(result <= money) {
            money-=result;
            return money;
        } else {
            return money;
        }
    }

static int chocoOp (int arr[],int money) { //O(logN)
    Arrays.sort(arr);
    int result=arr[0]+arr[1];
    if(money >= result) {
        money-=result;
        return money;
    } else {
        return money;
    }
}

static int chocoBrute (int arr[],int money) {
    int ans=0;
    int max=Integer.MAX_VALUE;
    // int max=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++) {
            ans=arr[i]+arr[j];
            max=Math.min(max, ans);
        }
    } return (money >= max) ? money-=max : money;
}
    public static void main(String[] args) {
        int arr[]={1,2,2};
        System.out.println(minChoco(arr, 3));   
        System.out.println(chocoOp(arr, 3));
        System.out.println(chocoBrute(arr, 3));
    }
}

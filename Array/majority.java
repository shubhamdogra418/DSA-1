import java.util.*;

public class majority {
//moore voting algo
    static int majorityEl(int arr[]) { //O(n)
        int count=1;
        int res=0;
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i]==arr[res]) {
                count++;
            } else count--;
            if(count==0) {
                res=i;
                count=1;
            }
        } return arr[res];
    }

    static int majorityBrute (int arr[]) { //O(n2)
        int n=arr.length;
        for (int i=0;i<arr.length;i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                } if(count> n/2) {
                    return arr[i];
                }
            }
        } return -1;
    }

//Usign HashMap
   
    
    public static void main(String[] args) {
        int arr[]={8,8,6,6,6,4,6};
        System.out.println(majorityEl(arr));
        System.out.println(majorityBrute(arr));
    }
}

import java.util.*;
public class makeItEmpty {
//2870. Minimum Number of Operations to Make Array Empty
    static int makeArrayEmpty (int arr[]) {
        HashMap <Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0 )+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            int val= entry.getValue();
            
            if(val == 1) return -1;
            else {
                if(val % 3==0) {
                    count+=val/3;
                } else if( val%3==1 || val%3==2) {
                    count+=val/3+1;
                } else if (val%2==0) {
                    count+=val/2;
                } else{
                    return -1;
                }
            } 
        } return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,2,2,4,2,3,4};
        System.out.println(makeArrayEmpty(arr));
    }
}

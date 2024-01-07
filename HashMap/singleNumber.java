import java.util.*;
class singleNumber {
    static int onlySingle (int arr[]) {
        Map <Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],2);
            } else {
                map.put(arr[i], 1);
            }
        } for(Map.Entry<Integer,Integer>  entry: map.entrySet()) {
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        } return -1;

    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(onlySingle(arr));

    }
}
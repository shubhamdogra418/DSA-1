import java.util.*;

public class twoEqual {
//two pointers
    static int longest (String str) {
        int low=0;
        int high=str.length()-1;
        int max=0;
        while(low <= high) {
            if(str.charAt(low) == str.charAt(high)) {
                int curr_max= high-low;
                max=Math.max(curr_max, max);
            } 
            low++;
            high--;

        } return max-1;
    }
//nested for loops
    static int findLong(String str) {
        int max=0;
        for(int i=0; i<str.length()-1;i++) {
            for(int j=0;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    int curr_max= j-i;
                    max=Math.max(curr_max,max);
                }
            }
        } return max-1;
    }
//using hashmap
    static int usingHash (String str) {
        int res=0;
        HashMap <Character, Integer > map= new HashMap<>();
            for(int i=0;i<str.length();i++) {
                if(map.containsKey(str.charAt(i))) {
                    //new entry- old entry
                    res=Math.max(res, i-map.get(str.charAt(i)));
                } else {
                    //inserting index
                    map.put(str.charAt(i),i);

                }
            } return res-1;

    }
//using arrays instead of HashMaps saving computations this efficient
    static int usingArrays (String str) {
        int ans=0;
        int arr1[]= new int [26];
        int arr2[]= new int [26];
        Arrays.fill(arr1, -1);
        Arrays.fill(arr2, -1);
        for(int i=0;i<str.length();i++) {
            int curr=str.charAt(i)- 'a';
            if(arr1[curr]==-1) {
                arr1[curr]=i;
            } else {
                arr2[curr]=i;
                ans=Math.max(ans, arr2[curr]-arr1[curr]);
            }
        } return ans-1;
    }

    public static void main(String[] args) {
        String str="abca";
        System.out.println(longest(str));
        System.out.println(findLong(str));
        System.out.println(usingHash(str));
        System.out.println(usingArrays(str));

    }
}

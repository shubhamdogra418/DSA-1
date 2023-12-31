import java.util.*;
public class permutations {
    static boolean isPerm ( String p, String s) {
        HashMap<Character, Integer> pMap= new HashMap<>();
        HashMap<Character, Integer> Window_Map= new HashMap<>();
        for(int i=0;i<p.length();i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
        }
        int left=0;
        int right=0;
        while(right < s.length()) {
            char c=s.charAt(right);
            Window_Map.put(c, Window_Map.getOrDefault(c, 0)+1);
            right++;

            if(pMap.equals(Window_Map)) return true;

            if(right-left == p.length()) {
            char l= s.charAt(left);
            if(Window_Map.containsKey(l)) {
                Window_Map.put(l, Window_Map.getOrDefault(l, 0)-1);
                if(Window_Map.get(l)==0) {
                    Window_Map.remove(l);
                }
            } left ++; 
        } 
    } return false;
    } 

//using arrays
static boolean allZeroes(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        if(arr[i]==0) return true;
    } return false;
}
    static boolean usingArray (String s,String p) {
        int arr[]= new int[26];
        for(int i=0;i<p.length();i++) {
            arr[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i)-'a']--;
            if(i-p.length() >= 0) {
                arr[s.charAt(i-p.length())-'a']++;
            } if(allZeroes(arr)) return true;
        } return false;

    }

    public static void main(String[] args) {
        String p="ab";
        String s="eidbaooo";
        System.out.println(isPerm(p, s));
        System.out.println(usingArray(s, p));
        
    }
}

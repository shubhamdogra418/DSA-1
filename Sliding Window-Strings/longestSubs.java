import java.util.*;
public class longestSubs {
    static int longestSubstring (String s) {
        int n=s.length();
        int max=0;
        Set<Character> set= new HashSet();
        int left=0;
        for(int right=0; right < s.length(); right++) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
            } else {
                while(set.contains(s.charAt(right))) {
                    //sliding begins
                    set.remove(s.charAt(left++));
                } set.add(s.charAt(right));
            }
        } return max;
    }
//shorten it
    static int longestSub (String s) {
        Set<Character> set= new HashSet<>();
        int left=0, right=0, max=0;
        while (right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max=Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        } return max;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(longestSubstring(s));
        System.out.println(longestSub(s));
    }
}

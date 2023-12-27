public class baloon {
//1578. Minimum Time to Make Rope Colorful
    static void baloonColor (String s,int arr[]) {
        int time=0;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                time+=Math.min(arr[i], arr[i-1]);
                arr[i]=Math.max(arr[i],arr[i-1]);

            } 
        } System.out.println(time);
    }
    public static void main(String[] args) {
        String s="aaaabbbbcddd";
        int arr[]={2,3,1,4,2,5,4,2,1,3,3,3};
        baloonColor(s, arr);
    }

}

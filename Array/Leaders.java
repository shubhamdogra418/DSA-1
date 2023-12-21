import java.util.*;
public class Leaders {

    //stars from reverse
    static void leadersInArray (int arr[]) { //O(n),no extra space
        int n=arr.length;
        int currLdr=arr[n-1];
        System.out.print(currLdr+" ");
        for(int i=arr[n-2]; i>=0; i--) {
                if(arr[i] > currLdr) {
                    currLdr=arr[i];
                    System.out.print(currLdr+" ");
                } 
            }
        }
    static ArrayList <Integer> leadersAL (int arr[]) { //O(n), eaxra space as Array List
        ArrayList <Integer> al= new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        al.add(max);
        for(int i=n-2; i>=0; i--) {
            if(arr[i]>max) {
                max=arr[i];
                al.add(max);
            } 
        } Collections.reverse(al); return al;
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2};
        // leadersInArray(arr);
        System.out.println(leadersAL(arr));
    }
}

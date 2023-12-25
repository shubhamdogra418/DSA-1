import java.util.*;

public class nextgreater {
    static void nextGrt (int arr[]) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1] > arr[i]) {
                res[i]=arr[i+1];
                System.out.print(res[i]+" ");
            }  else{
                res[i]=-1;
                System.out.print(res[i]+" ");
            }
        } System.out.print("-1");
        
    }

    static void nexGrtStack (int arr[]) {
        Stack <Integer> s= new Stack<>();
        int res[]= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            } 
            if(s.isEmpty()) res[i]=-1;
            else res[i]=arr[s.peek()];
            s.push(i);
        } for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        } System.out.println();
    }
//505. Next Greater Element II
    static void nextGrtCircle (int arr[]) {
        Stack<Integer> s= new Stack<>();
        int res[]= new int [arr.length];
        for(int i=arr.length-1; i>=0; i--) {
            s.push(i);
        } 
        for(int i=arr.length-1;i>=0;i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            } if(s.isEmpty()) res[i]=-1;
                else res[i]= arr[s.peek()];
                s.push(i);
        } for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        // nextGrt(arr);
        nexGrtStack(arr);
        nextGrtCircle(arr);
    }
}

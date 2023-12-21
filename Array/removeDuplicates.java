public class removeDuplicates {
    static void remDup (int arr[]) {
        int n=arr.length;
        int temp[]= new int [n]; //extra space
       temp[0]=arr[0];
       int res=1;
       for(int i=1;i<n;i++) {
            if(temp[res-1]!=arr[i]) {
                temp[res]=arr[i];
                res++;
            }
       }  for(int i=0;i<temp.length;i++) {
        System.out.print(temp[i]+" ");
       }
    }
//single loop
//https://www.youtube.com/watch?v=DEJAZBq0FDA
    static void singleLoop (int arr[]) {
        int res=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[res-1]!=arr[i]) {
                arr[res]=arr[i];
                res++;
            }
        } for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void remDupp (int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]!=arr[i+1]) {
                System.out.print(arr[i]+" ");
            } 
        } System.out.print(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        int arr[]={10,10,10};
        // remDup(arr);
        // singleLoop(arr);
        remDupp(arr);
    }
}

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
//must aintaine pointer to insert next elements which will increment as new element inserts
    static void singleLoop (int arr[]) {
        int res=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[res-1]) {
                arr[res]=arr[i];
                 res++;
            }
        } for (int i=0;i<arr.length;i++) {
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

//80. Remove Duplicates from Sorted Array II
    static int remDup2 (int arr[]) {
        int index=2;
        for(int i=2;i<arr.length;i++) {
            if(arr[i]!= arr[index-2]) {
                arr[index]= arr[i];
                index++;
            }
        } return index;
    }

//27. Remove Element
    static int removeEl (int arr[], int val) {
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!= arr[index]) {
                arr[index] =arr[i];
                index++;
            }
        } return index;
    }


    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        // remDup(arr);
        // singleLoop(arr);
        // remDupp(arr);
        System.out.println(remDup2(arr));
        remDup2(arr);
        System.out.println(removeEl(arr,2));
        
    }
}

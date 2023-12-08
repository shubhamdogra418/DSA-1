public class baiscs {
//linearSearch
    public static int linearSearch(int arr[],int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            } 
        } return -1;
    }

//largest in array
    public static int largestInArray (int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max=arr[i];
            }            
        } return max;
    }
//Reverse an Array
    public static void reverse (int arr[]) {
    //method 1- looping
        // for(int i=arr.length-1;i>=0;i--) {
        //     System.out.print(arr[i]+" ");
        // }
    //method 2- extra space of temp
        int temp;
        int low=0;
        int high=arr.length-1;
        while (low <=high) {
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
//pairs in array
    public static void pairs (int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                System.out.print("("+ arr[i]+","+arr[j]+"), ");
            } System.out.println();
        }
    }
//print subarrays   
    public static void subArrays (int arr[]) {
        int count=0;
        for(int i=0;i<arr.length+1;i++) {
            for(int j=i;j<arr.length+1;j++) {
                for(int k=i;k<j;k++) {
                    System.out.print(arr[k]+" ");
                } count++; 
                System.out.println();
            } 
        } System.out.println("total subarays: "+ count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        // int target=4;
        // System.out.println(linearSearch(arr, target));
        // System.out.println(largestInArray(arr));
        // reverse(arr);
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print(arr[i]+" ");
        // }
    //pairs
        // pairs(arr);
    //subarrays of an array
        subArrays(arr);
    }
}

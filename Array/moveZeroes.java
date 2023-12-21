public class moveZeroes {
//https://www.youtube.com/watch?v=aayNRwUN3Do
    static void moveZero(int arr[]) { //O(n2)
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[j]!=0) {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }

    static void moveZeroEnd (int arr[]) {
        int count=0;  // as a pointer
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++; //incerementing only if there's swap
            }
        } for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
        moveZeroEnd(arr);
    }
}

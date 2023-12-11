class moretha25 {
//O(n2)
    public static int morethan (int arr[]) {
        int n=arr.length;
        for(int i=0;i<arr.length;i++) {
            int count=0;
            for(int j=i;j<n;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                } 
            } if(count > n/4) {
                return arr[i];
            }
        } return -1;
    }
//O(n)
    public static int anotherOp (int arr[]) {
        int n=arr.length;
        int count=1;
        for(int i=0;i<n-1;i++) {
            if(arr[i]==arr[i+1]) {
                count++;
             if (count > n/4) return arr[i]; 
            } else {
                count=1; 
            } 
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,6,6,6,6,7,10};
        System.out.println(morethan(arr));
        System.out.println(anotherOp(arr));
    }
}
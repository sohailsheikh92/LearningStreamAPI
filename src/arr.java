public class arr {
    static int secLargest(int arr[]){
        int n=arr.length;
        int max=-1,secMax=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]>secMax && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax;
    }

    static void moveZerosToEnd(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        ?
    }

    static int minDiff(int arr[])
    {
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        if(n==1)
            return ans;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                ans=Math.min(diff,ans);
            }
        }
        return ans;
    }

    //GFG Problem : Pair with given sum
    static boolean pairgivenSum(int arr[],int sum){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum)
                        return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println("alhamdulillah learned github");
//        int arr[] = {1,0,6,8,0,4,8,6,0};
//        moveZerosToEnd(arr);
//        for(int i : arr){
//            System.out.print(i+" ");
//        }
//        System.out.println(secLargest(arr));

//        int arr[]={1,8,12,5,18};
//        System.out.println(minDiff(arr));

        //GFG problem : Pair with a given sum
        int arr[]={3,2,8,15,-8};
        int sum=17;
        System.out.println(pairgivenSum(arr,sum));
        int summ=45;
        int n=78;
        int nm=78;
        String s="Sohail";

    }
}

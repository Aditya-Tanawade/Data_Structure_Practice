package Arrays;

public class LargestnSmallest {
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,8};
        System.out.println("The largest Element of an array is " + largefind(arr));
        System.out.println("The Smallest element of an array is " +smallfind(arr) );

    }
    public static int largefind(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(largest < arr[i]){
                largest =arr[i];
            }

        }
        return largest;
    }

    public static int smallfind(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}

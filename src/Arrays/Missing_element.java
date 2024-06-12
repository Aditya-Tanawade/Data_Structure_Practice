package Arrays;

public class Missing_element {

    public static int missElement(int arr[],int n){

        int totalsum=n * (n+1)/2;
        int arrsum=0;
        for(int a : arr){
            arrsum=arrsum+a;
        }
        return totalsum - arrsum;
    }


    public static void main (String args[]){
        int arr[]={1,2,3,5};
        for(int a : arr){
            System.out.print(a + " ");
        }
        int n=5;
        System.out.println();

        System.out.println("Missing element of an array is " + (missElement(arr,n)));
    }
}

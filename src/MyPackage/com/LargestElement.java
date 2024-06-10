package MyPackage.com;

public class LargestElement {
    public static void main (String args[]){
        int arr[]={10,20,30,40,50};

        System.out.println("Largest element of array is "  +LargeEle(arr));

        System.out.println("Smallest element of array is "  +SmallestELe(arr));


    }

    public static int LargeEle(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int SmallestELe(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest= arr[i];
            }
        }
        return smallest;
    }


}

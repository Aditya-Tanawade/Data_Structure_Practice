package Arrays;

public class ReverseArray {
    public static void reverse(int number[]){
        int start=0;
        int last= number.length-1;

        while(start<last){
                int temp=number[last];
              number  [last ]=number[start];
              number[start]=temp;
              start++;
              last--;
        }
    }


    public static void main (String args[]){
        int number[]={10,50,20,70,4,8};
         reverse1(number);
    }


    public static void reverse1(int arr[]){
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }
}

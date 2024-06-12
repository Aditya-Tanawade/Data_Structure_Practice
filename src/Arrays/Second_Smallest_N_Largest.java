package Arrays;

public class Second_Smallest_N_Largest {

    public static int secondSmallest(int arr[], int n){
        int sSmallest=Integer.MAX_VALUE;
        int smallest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=sSmallest;
                smallest=arr[i];
            }
            if(arr[i]>smallest && arr[i]<sSmallest ){
                sSmallest=arr[i];
            }
        }


        return sSmallest;
    }
    public static int secondLargest(int arr[],int n){
        int sLargest=-1;
        int largest=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
               sLargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }

        }
        return sLargest;
    }

    public static void main (String args[]){
        int nums[]={10,20,12,8,27,28,29,29};
        int n=8;
        for(int i =0;i<nums.length;i++){
            System.out.print (nums[i] + " ");
        }
        System.out.println();

        System.out.print("Second Largest element of give array is ");
        System.out.println(secondLargest(nums,n));


        System.out.print("Second Smallest element of give array is ");
        System.out.print(secondSmallest(nums,n));
    }
}

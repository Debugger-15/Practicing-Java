


class Solution{

    public static void main(String[] args) {
       int arr[] = new int[]{-1,2,23,-4};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
   static long maxSubarraySum(int arr[], int n){

        // Your code here
        long max=arr[0],sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}
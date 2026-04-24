public class MaxSubArraySum_KadaneSalgorithm{
    public static void main(String[] args) {

// negative sum make it zero don't consider for addition

        int arr[] = {-2,-3, 4, -1, -2, 1, 5,-3};
        int maxSum=Integer.MIN_VALUE;
        int currentSum = 0;
 
        for(int i =0; i <arr.length; i++){
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            else{
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println("MaxSum :: "+ maxSum);
        }
    }
}
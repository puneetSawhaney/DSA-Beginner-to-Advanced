public class MaxSubArraySum_BruteForce{
    public static void main(String[] args) {
        int arr[] = {2,4,5,6};
        int maxSum=Integer.MIN_VALUE;
        for(int i =0; i <arr.length; i++){
            int start = i;
            for(int j =0; j < arr.length; j++){
                int end =j;
                 int currentSum =0;
                for(int k = start; k<=end; k++){
                   currentSum+=arr[k];
                    //System.out.print(arr[k]+" ");
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                System.out.println("maxSum :: " + maxSum);
            }
            System.out.println();
        }
    }
}
public class MaxSubArraySum_PrefixSum{
    public static void main(String[] args) {
        int arr[] = {1,-2,5,6,-3};
        int prefix[] = new int[arr.length];
        int maxSum=Integer.MIN_VALUE;
        int currentSum = 0;
        prefix[0] = 0;
        for(int i = 1; i< arr.length; i++){
            prefix[i]= prefix[i-1]+arr[i];   
        }

        
        for(int i =0; i <arr.length; i++){
            int start = i;
            for(int j =0; j < arr.length; j++){
                int end =j;
                currentSum = 0;
                currentSum =  start == 0 ? prefix[end] : prefix[end] -prefix[start];
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                System.out.println("maxSum :: " + maxSum);
            }
            System.out.println();
        }
    }
}
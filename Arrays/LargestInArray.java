package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,34,7,9,21,56,78,43,89};

        int larger = arr[0];

        for(int i = 0; i< arr.length-1; i++){
            if(arr[i+1]>larger){
                larger = arr[i+1];
            }
        }
        System.out.println(larger);
    }
}

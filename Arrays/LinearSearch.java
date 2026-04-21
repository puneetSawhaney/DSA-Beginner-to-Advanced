package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,6,73,22,256,223};
        int key = 256;

        for(int i = 0;  i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(arr[i ]+ " Key Found at index " + i +"...");
            }
        }
    }
}

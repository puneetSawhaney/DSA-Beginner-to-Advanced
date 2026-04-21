package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary search appliable for sorted array only

        int arr[] = {1,2,3,4,5,6,7};
        int key =3;
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if (arr[mid] == key){
                System.out.println("Found at index :: " + mid);
                break;
            }
            // search left
            if(arr[mid] > key){
                right = mid-1;
            }
            // search right
            else if (arr[mid] < key){
                left = mid +1;
            }

        }
    }
}

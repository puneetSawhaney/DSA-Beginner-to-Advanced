public class Reverse{

    public static void main(String args[]){
        // print reverse of a number
        int n = 1234;
        while (n !=0){
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }

}
public class PrimeNumber{

    public static void main(String args[]){
        // Check if number is Prime or not
        int n =137;
        boolean prime = true;
        if(n == 2){
            System.out.print("Number is Prime");
        }else {
            for (int i =2 ; i<= Math.sqrt(n); i++ ){
                if (n % i == 0){
                    //System.out.print("Not a prime number");
                    prime = false;
                }
            }

            if(prime == true){
                System.out.print("Number is Prime");
            }else{
                System.out.print("Not a prime number");
            }
        }

    }

}
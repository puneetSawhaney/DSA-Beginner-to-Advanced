public class PrimesInRange {
    public static void main (String args[]){

        int n =10;
        boolean isPrime = true;
        for(int i = 2; i<=n; i++){
            for(int j =2; j <=Math.sqrt(i); j++){
                if (i == 2){    
                    break;
                }
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+ " ");  
            }
            isPrime = true;
        }

    }
}

// Output
// 2 3 5 7
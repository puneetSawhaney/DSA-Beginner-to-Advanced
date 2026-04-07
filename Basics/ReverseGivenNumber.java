public class ReverseGivenNumber{

    public static void main(String args[]){
        // Reverse the number 
        int n = 1234;
        int rev =0;
        while (n !=0){
            int rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.print(rev);
    }

}
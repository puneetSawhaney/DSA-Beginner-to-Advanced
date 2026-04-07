public class FactorialOfNumber{

    public static void main(String args[]){
        // find the factorial of a number 

        int n = 5;

        int fact = fact(5);
        System.out.println(fact);
    }

    public static int fact(int n){
        if (n ==1){
            return 1;
        }
        return n * fact(n-1);
    }

}
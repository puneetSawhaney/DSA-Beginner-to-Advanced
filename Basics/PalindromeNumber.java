public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 4321234;
        int palindrome = 0;
        int pow = 0;
        int actualNum = n;
        while (n !=0){
            int rem = n%10;
            palindrome += rem * Math.pow(10, pow);
            pow++;
            n = n/10;
        }
        System.out.println(palindrome);
        if (actualNum == palindrome){
            System.out.println("Number is PalindromeNumber");
        }
        else{
            System.out.println("Number is not PalindromeNumber");
        }
    }
}

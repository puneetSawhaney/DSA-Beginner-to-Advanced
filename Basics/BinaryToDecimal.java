public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 110;
        int pow = 0;
        int dec = 0;

        while (n!=0){
            int rem = n % 2;
            dec += rem * Math.pow(2, pow);
            pow++;
            n = n/10;
        }

        System.out.println(dec);
    }
}

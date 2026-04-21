public class DecimalTOBinary {
    public static void main(String[] args) {
        int n = 20;
        int pow = 0;
        int binary = 0;
        while (n!=0){
            int rem = n%2;
             binary += rem * (Math.pow(10, pow));
            pow++;
            n= n/2;

        }
       System.out.print(binary);
    }
}

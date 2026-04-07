public class CharacterPattern {
    public static void main(String[] args) {
        // char pattern

        // A
        // BC
        // DEF
        // GHIJ

        int n =4;
        char ch = 'A';
        
        for(int i =0; i<=n; i++){
            for(int j = 0; j< i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
}

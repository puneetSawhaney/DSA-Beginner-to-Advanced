Inverted Half Pyramid Pattern with Numbers Patterns

12345
1234
123
12
1


public class Main
{
	public static void main(String[] args) {
		int n =5;
		
		for(int i = 1; i<=n; i++){
		    for(int j = 1; j<=n; j++){
		        if(i+j-1 <= n){
		            System.out.print(j);
		        }
		    }
		    System.out.println();
		}
		
	}
}
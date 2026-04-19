
0-1 Triangle Pattern


1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 




public class Main
{
	public static void main(String[] args) {
		int n =5;
		int count =1;
		for(int i = 0; i<=n-1; i++){
		    for(int j = 0; j<=i; j++){
		        if(i+j == 0 || (i+j)%2 ==0 ){
		            System.out.print("1"+" ");
		        }else{
		            System.out.print("0"+ " ");
		        }
		    }
		    System.out.println();
		}
		
	}
}
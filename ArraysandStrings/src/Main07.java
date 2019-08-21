import java.util.Scanner;

//Counting Stars

public class Main07 {
	
	public static void main(String[] args) {
		
		// n and m that denote the rows and columns of the matrix
		int  n , m ;
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		
		int[][] dataset= new int[n][m];
		
		// Get the input for the dataset matrix 
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dataset[i][j] = sc.nextInt();
						
			}
			
		}

		int t ;
		
		t= sc.nextInt();
		
		int [][] query = new int [t][4];
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 4; j++) {
				 query[i][j]=sc.nextInt();
				
			}
		}

		// sum
		
		for (int k = 0; k < query.length; k++) {
			
			int sum = 0;
		
			int px= query[k][0];
			int py= query[k][1];
			int qx= query[k][2];
			int qy= query[k][3];
			
			for(int i= px-1;i <= qx-1;i++) {
				for(int j = py-1;j <= qy-1;j++) {
					sum = sum+dataset[i][j];
				}
			}
			System.out.println(sum);
			
			
		}
		
		
		
	}

}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(); 
		
		
		for (int i = 0; i < str.length(); i++) {
			
		if ( sb.toString().contains(String.valueOf(str.charAt(i) )) == false ) {
				
				sb.append(str.charAt(i));
				int count=1;			
				for(int j=i+1; j<str.length(); j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
				}
				sb.append(count);
				
			}			
		}
		System.out.println(sb.toString());
		sc.close();
	}
		
}


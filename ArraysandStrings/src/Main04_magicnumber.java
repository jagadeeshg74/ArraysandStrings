import java.util.Scanner;

//Magic Number

public class Main04_magicnumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N=sc.nextInt();
		int nextmagic= ++ N;
		
		
	while (! checkMagic(nextmagic))	{
		
		nextmagic ++;
	}
	
	System.out.println(nextmagic);
	
	}
	
	
	public static boolean checkMagic(int num) {
		
		String newstr= Integer.toString(num);

		for (int i = 0; i < newstr.length(); i++) {
			if (  (newstr.charAt(i)=='4') || (newstr.charAt(i)=='7' ))
			{
				continue;
				
			}
			else   return false;
		}
		
		return true;
		
	}

}

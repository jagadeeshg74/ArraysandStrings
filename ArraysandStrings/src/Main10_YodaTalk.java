import java.util.StringTokenizer;

public class Main10_YodaTalk {
	
	public static void main(String[] args) {
		
		
		String normal_talk="I will go now to find the Wookiee";
		
		StringBuffer sb = new StringBuffer();
		
		String [] arrOfStr=normal_talk.split(" ");
		
		String temp = arrOfStr[0];
		String temp2= arrOfStr[1];
		
		for (int i = 2; i < arrOfStr.length; i++) {
			
			sb.append(arrOfStr[i]);
			sb.append(" ");
		}
           sb.append(temp+" "+temp2);
		System.out.println(sb);
		
    
}
}

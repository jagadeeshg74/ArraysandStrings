import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

// MODULO

//Your program should accept 10 non-negative integers as input and output the number of distinct non-negative integers in the input, if they are considered MOD 42.

public class Main01 {
	
	public static void main(String[] args) {
		
		int[] mynumbers = new int[10];
		int[] modulo = new int[10];
		int i= 0;
		int count=0;
		boolean[] uniques = new boolean[10];
		
		Scanner sc= new Scanner(System.in);
		
		while(i < 10 ) {
			mynumbers[i] = sc.nextInt();
			modulo[i] = mynumbers[i] % 42;
		//	System.out.println(modulo[i]);
			i++ ;
	    }
		
		
		for( i = 0; i < 10; i++) {
		 
		    uniques[i] = true;
		    for(int j = 0; j < 10; j++) {
		        if(modulo[i] == modulo[j] && i != j) {
		            uniques[i] = false;
		        }
		    }
		}
	
	for (int b : modulo) {
		System.out.println(b);
	}	
	
	System.out.println("-------");
	
	for (boolean b : uniques) {
		System.out.println(b);
	}
	
	
	
		for( i = 0; i < 10; i++) {
		    if(uniques[i]) {
		       count ++;
		    }
		
		    
			}
		
		System.out.println( count);
	}
	
}
	


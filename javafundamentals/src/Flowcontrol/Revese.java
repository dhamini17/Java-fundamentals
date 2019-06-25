package Flowcontrol;

import java.util.Scanner;

public class Revese {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
        int n=  in.nextInt();  
        while(n>0) {
        	int r=n%10;
        	System.out.print(r);
        	n=n/10;
        }
		
		
	}
}

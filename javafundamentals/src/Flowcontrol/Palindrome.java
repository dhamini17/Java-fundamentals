package Flowcontrol;

import java.util.Scanner;

public class Palindrome {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
        int n=  in.nextInt();  
        int x,sum=0 ;
        x=n;
        while(n>0) {
            int r=n%10;
         sum=sum*10+r;
        	n=n/10;
        }
        if(x==sum) {
        System.out.println("It is a palindrom");
        }
        else
        	System.out.println("It is not a palindrom");
	}
}

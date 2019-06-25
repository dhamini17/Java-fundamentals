package Flowcontrol;

import java.util.Scanner;

public class Prime_or_composiite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		Scanner in=new Scanner(System.in);
            int n=  in.nextInt();  
            if((n==1) ||(n==0)) {
        		System.out.println("not a prime or composite number");
        }
            else {
            for(int i=1;i<=n/2;i++) {
            	/*if((n==1) ||(n==0)) {
            		System.out.println("not a prime or composite number"); }*/
            
            	if(n%i==0) {
           		 count++;
           	}
            }
            if(count==2)
            {
            System.out.println("Prime number");
            }
            else
            {
            	System.out.println("Not a prime number");
            }
	

	}
	}
}

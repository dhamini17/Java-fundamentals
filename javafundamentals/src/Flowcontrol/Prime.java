package Flowcontrol;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
            int n=  in.nextInt();  
            for(int i=1;i<=n/2;i++) {
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

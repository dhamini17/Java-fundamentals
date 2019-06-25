package Flowcontrol;
import java.util.Scanner;

public class Sum_of {
	public static void main(String[] args) {
		int sum=0;
		Scanner in=new Scanner(System.in);
		
        int n=  in.nextInt();  
        while(n>0) {
        	int r=n%10;
        	sum=sum+r;
        	n=n/10;
        }
	System.out.println(+sum);
	}
}

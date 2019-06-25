package Flowcontrol;

public class Posi_or_neg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int num1=Integer.parseInt(args[0]);
		if(num1>0)
		{
		System.out.println("Positive number");
		}
		else if (num1<0)
		{
			System.out.println("Negative number");
	}
		else
		{
			System.out.println("Zero");
	}
	}
}

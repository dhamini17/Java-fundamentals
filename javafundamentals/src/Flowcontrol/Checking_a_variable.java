package Flowcontrol;
import java.util.Scanner;
public class Checking_a_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      Scanner i=new Scanner(System.in);
      char character = i.next().charAt(0);
      if((character>='A' && character<='Z') || (character>='a' && character<='z')) {
    	  System.out.println("Alphabets");
      }
    	  else if  (character>='0' && character<='9')
    	  {
    		 System.out.println("digit"); 
    	  }
    	  else
    	  {
    		  System.out.println("Special Symbol");
    	  }
      
    
    	  
      }
	}



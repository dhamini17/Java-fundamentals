package Flowcontrol;
import java.util.Scanner;


public class Comma_separator {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
		      String st = sc.nextLine();
		      //for finding length of string 
		      int n=st.length();
		      if(n==0) {
		    	  System.out.println("No value");
		    	 
		      }
		      else
		      {
		    	  for(int i=0;i<=n;i++) {   //for each value in args store in i
		              if(i==' ') { 
		    		  System.out.print(i+" , ");
		              }
		    			  
		    		  }
		      }
		}
			
     }
		
package Flowcontrol;
import java.util.*;
public class Prime99 {
	public static void main(String[] args) {
		int count=0;
		
		
		/*for(int i=10;i<=99;i++) {
		  for(int j=2;j<=i/2;j++) {
          	if(i%j==0) {
          		 count++;
          	}
		  }
		  if(count>0)
          {
          continue;
          }
		  else {
			  System.out.println(i+" prime");
		    
		  }
		}*/
		 int c=0;
	        for(int j=10;j<=99;j++)
	        {
	            c=0;
	        for(int i=2;i<=j/2;i++)
	        {
	            if(j%i==0)
	            c++;
	        }
	        if(c>0)
	            continue;
	        else
	            System.out.println(j);
	    }    
	

}
}

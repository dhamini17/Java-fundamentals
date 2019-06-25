package Flowcontrol;

import java.util.Scanner;

public class Pattern {
          public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=1;
	int j;
              Scanner in=new Scanner(System.in);
			     int n =  in.nextInt();
	while(i<=n) {
				
					for( j=1;j<=i;j++) 
						System.out.print("*  ");
					i++;
					
					System.out.println(" ");
				}
			}
          }
	



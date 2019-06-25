package Flowcontrol;

import java.util.Scanner;
public class Letters {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     char s=sc.next().charAt(0);
     if(Character.isLowerCase(s))
         System.out.println(s+"->"+Character.toUpperCase(s));
     else
       System.out.println(s+"->"+Character.toLowerCase(s));

}
}

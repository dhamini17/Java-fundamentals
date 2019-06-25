package Flowcontrol;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,c=0;
		while(c!=5){
           i++;
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
            c++;
        }
        
    }

	}

}

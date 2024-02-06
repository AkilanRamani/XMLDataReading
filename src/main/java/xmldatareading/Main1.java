package xmldatareading;

import java.io.InputStream;
import java.util.Scanner;

public class Main1 {
	
	

	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		int a = sc.nextInt();
		System.out.println(a);
		//Scanner b = new Scanner(System.in);
		System.out.println("Enter value of B: ");
		int b = sc.nextInt();
		try {
		c= a/b;
		if(b==0)
		{
		throw new ArithmeticException();
		}
		System.out.println("Value of C is: " +c);
		}
		catch(ArithmeticException e) {
		System.out.println("Caught this here");
		}
		finally {
		}
		System.out.println("Finally block is here");
		}
		

	}



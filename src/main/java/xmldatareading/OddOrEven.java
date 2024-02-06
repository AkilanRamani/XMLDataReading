package xmldatareading;

import java.io.InputStream;
import java.util.Scanner;

public class OddOrEven {

	
	public static void main(String[] args) {
		
		InputStream stream = System.in;

        try (Scanner reader = new Scanner(stream)) {
			System.out.print("Enter a number: ");
			int num = reader.nextInt();

			if(num % 2 == 0)
			    System.out.println(num + " is even");
			else
			    System.out.println(num + " is odd");
		}
    }


	}



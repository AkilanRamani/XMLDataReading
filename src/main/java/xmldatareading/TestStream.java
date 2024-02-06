package xmldatareading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TestStream {

	public static void main(String[] args) throws IOException {
		  URL url = new URL("https://www.javatpoint.com/java-bufferedreader-class");
		  InputStream stream = url.openConnection().getInputStream();
		  InputStreamReader reader1 = new InputStreamReader(stream);
		  //which will decode the binary numbers to number format(ASCII Values) and into the characters(the ASCII that refers to the Corresponding characters). 
         //Returns an input stream that reads from this open connection.A SocketTimeoutException can be thrown when reading from thereturned input stream if the read timeout expires before datais available for read.
		  BufferedReader reader = new BufferedReader(reader1);
		  FileWriter writer = new FileWriter("D:\\data.txt");
		  //BufferedWriter writer1 = new BufferedWriter(writer);

		    String line;
		    while ((line = reader.readLine()) != null) {
		      System.out.println(line);
		      writer.write(line);
		     
		     
		    }

		    reader.close();
		    writer.close();
		  }
		

		   

	}



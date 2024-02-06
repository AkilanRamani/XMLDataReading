package xmldatareading;

import java.io.FileOutputStream;

public class DataWriting {

	public static void main(String[] args) {
		String data = "This is a line of text inside the file.";

        try {
           FileOutputStream out = new FileOutputStream("akiklan.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes(); // Encoding the string into the byte array using the UTF-8 (Default charset).

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

	}



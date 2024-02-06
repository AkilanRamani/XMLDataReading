package xmldatareading;

import java.util.ArrayList;

public class ListToStringArray {

	public static void main(String[] args) {
		 ArrayList<String> l= new ArrayList<String>();//ArrayList implementation  
         l.add("Hello");  
         l.add("Java");  
         l.add("Tpoint");  
         int a =  l.size();
         String a1[] = new String[a];
         String frnames[]=l.toArray(a1);//ArrayList to String Array Conversion  
         for(String j: frnames) /// To display Array elements  
         {  
             System.out.println(j); // Printing Elements  
         }  
     }  

}



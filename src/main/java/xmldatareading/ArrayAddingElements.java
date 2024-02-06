package xmldatareading;


import java.util.Arrays;

public class ArrayAddingElements {

	public static void main(String[] args) {
			// TODO Auto-generated method stub  
			int arr[] = {1,2,3,4,5,6};  
			int n = arr.length;  
			int newArr[] = new int[n+1];  
			int value = 7;  
		    String a =	Arrays.toString(arr);
			System.out.println(a);  
			for(int i = 0; i<n; i++) {  // i=0; i<6; i++; => 0,1,2,3,4,5. 
			
			newArr[i] = arr[i];  //arr[0]=> 1 , newArr[0] = 1; newArr[1] = 2;
			}  
			newArr[n] = value;  
			System.out.println(Arrays.toString(newArr));  
	}
	}



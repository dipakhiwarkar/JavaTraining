package com.yash.stringassignment;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		String str = "YASHTECH";
		char[] arr = str.toCharArray();
	
		 for (int i = 0; i < arr.length; i++) 
		    {      //Loop over java Array  outer Loop use
		        for (int j = i + 1; j < arr.length; j++) 
		        {  // Loop over java array
		            char tmp = 0;                            //tempraory variable in order to compare.
		            if (arr[i] > arr[j]) 
		            {          //compare outer loop object with inner loop 
		                tmp = arr[i];               // if greater than swapping.
		                arr[i] = arr[j];            // Swaping code here.
		                arr[j] = tmp;
		            }
		        }
		    }
		           // After Sorting Printing The Value.............

		 			
		 System.out.println("Ascending Order");
		           for (int i = 0; i < arr.length; i++) 
		           {     
		              System.out.print(arr[i]);  
		              arr.toString();
		           }System.out.println();
		           System.out.println("descending Order");
		           
		           for (int i = arr.length-1; i >= 0; i--) 
		           {     
		              System.out.print(arr[i]);  
		           }
		          
		}
	
	
	}

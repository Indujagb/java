package lab;
import java.util.*;
public class selectionsort {

	
	    void sort(int arr[], int n)
	    {
	      
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_index = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_index])
	                    min_index = j;
	// Swap the found minimum element with the first element
	            int temp = arr[min_index];
	            arr[min_index] = arr[i];
	            arr[i] = temp;
	        }
	    }
	 
	    // Prints the array
	    void printArray(int arr[],int n)
	    {
	        
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    
	    public static void main(String args[])
	    {	    int arr[]=new int[10000];
	    long start,end;

	        selectionsort ob = new selectionsort();
	       Scanner in = new Scanner(System.in);
	        
	        Random r=new Random();
	        System.out.println("enter no. of elements");
		    int n=in.nextInt();
		    in.close();

	        for(int i=0; i<n; i++)
	          		
			arr[i]=r.nextInt(10000);
	        System.out.println("UnSorted array");
	        ob.printArray(arr,n);
	        start=System.nanoTime();
	      
	        ob.sort(arr,n);
	       
	    	end=System.nanoTime();

    	
	        System.out.println("Sorted array");
	        ob.printArray(arr,n);
	        System.out.println("time taken is"+"\t"+(end-start)+"ns");
	    }
	    
	}

package interviewprgrms;

public class RemovElementAtIndex {

	public static void main(String[] args) {
		int[] arr = {1,2,5,6};
		int index=2;
		for(int i=index;i<arr.length;i++)
		{
			if(i<arr.length-1)
			{
				//shifting
				arr[i]=arr[i+1];
			}
			else
			{
				//Making last value as zero
				arr[i]=0;
			}
		}
		//displaying array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
//define the array of integers
int[] intArray = { 10,20,30,40,50 }; 

// display the original array 
System.out.println("Original Array: "
                   + Arrays.toString(intArray)); 

// index at which the element is to be deleted 
int index = 2; 

// the index 
System.out.println("Element to be deleted at index: "
                   + index); 

// check if the array is empty or index is out of bounds 
if (intArray == null || index<= 0  || index >= intArray.length)
{ 
    System.out.println("No removal operation can be performed!!");
} 

// create an array to hold elements after deletion
int[] copyArray = new int[intArray.length - 1]; 

// copy elements from original array from beginning till index into copyArray
System.arraycopy(intArray, 0, copyArray, 0, index); 

// copy elements from original array from index+1 till end into copyArray
System.arraycopy(intArray, index + 1, copyArray, index, intArray.length - index - 1); 

// display the copied array after deletion 
System.out.println("Array after deleting an element: "
                   + Arrays.toString(copyArray)); 

// SYNTAX
//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

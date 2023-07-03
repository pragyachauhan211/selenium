package basicProgram;

import java.util.Scanner;

class bubbleSortDemo1 {

	public void count() {
	int n;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=sc.nextInt();  

	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  

	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();  
	}  
//loop to access each array element

for (int i = 0; i < n-1; i++)
{
//loop to compare array elements

for (int j = 0; j < n-i-1; j++)
{
//compare two adjacent elements

//change > to < to sort in descending order
 
if (array[j] < array[j + 1]) {

//swapping occurs if elements

//are not in the intended order

int temp = array[j];

array[j] = array[j + 1];

array[j + 1] = temp;

}
}
}
System.out.println("Array elements are: ");  
//accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.print(array[i]);  
} 
}

public static void main(String args[]) 

{

	bubbleSortDemo1 p = new bubbleSortDemo1();
	p.count();

}

}
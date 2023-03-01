import java.util.Scanner;

public class SelectionSort {
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int noofelements;
		System.out.println("Enter the number of elements in the array");
		noofelements =scan.nextInt();
		int[] arr=new int[noofelements];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Sorting the elements using selection sort method");
		sort(arr);
		System.out.println("Displaying the array using selection sort");
		display(arr);
		
	}

	public static void sort(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=i;	
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}	
			}	
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}		
	}	
	
	private static void display(int[] arr) {
	
		for(int elem:arr)
		{
			System.out.println(elem);
		}	
	}
	}



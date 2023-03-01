import java.util.Scanner;

public class DuplicateCheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int numberofelements=scan.nextInt();
		int[] arr=new int[numberofelements];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter the "+i+" th element");
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Checking for duplicates.............");
		int dup=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
				{
					count++;
				}
			}
			
			if(count>1)
			{
				System.out.println("Duplicates found for "+i+" th location of array and element "+arr[i]);		
			}
			
			else
			{
				System.out.println("Duplicates not found for "+i+" th location of array and element "+arr[i]);
				dup=dup-1;
			}
			
		}
		
		if(dup==0)
		{
			System.out.println("No duplicates found in the array");
		}
		else
		{
			System.out.println("Duplicates present inside the array");
		}
		
	}

}

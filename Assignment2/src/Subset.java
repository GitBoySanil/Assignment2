import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		//Taking number of elements in the array as user input.In this case taking user input for 2 arrays. 
		System.out.println("Enter the number of elements in first array");
		int first=scan.nextInt();
		int[] arr1=new int[first];
		
		System.out.println("Enter the number of elements in second array");
		int second=scan.nextInt();
		int[] arr2=new int[second];
		
		//Entering the elements of first array
		int count=0;int count1=0;
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the "+i+" th element of the first array");
			arr1[i]=scan.nextInt();
		}
		
		//Entering the elements of second array
		System.out.println("Enter the elements of 2nd array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter the "+i+" th element of the second array");
			arr2[i]=scan.nextInt();
		}
		
		//logic of finding out whether second array is a subset of first array
		
		if(arr2.length<=arr1.length && arr2.length!=0 && arr1.length!=0 )
		{
			System.out.println("Finding whether second array is a subset of first array");
			for(int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr1.length;j++)
				{
					if(arr2[i]==arr1[j])
					{
						System.out.println("found "+arr2[i]);
						count++;
						break;
					}
				}
			}
		
		
				if(count==arr2.length)
					System.out.println("All the elements are found hence Second array is a subset of first array");
				else 
					System.out.println("All the elements are not found therefore, Array 2 is not a subset of array 1");
		
		}
		
		else
		{
			
			//To check if first array can be a subset of second array
			
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						System.out.println("found "+arr1[i]);
						count1++;
						break;
					}
				}
			}
			
			if(count1==arr1.length)
				System.out.println("All the elements of first array are present in second array , hence first array is a subset of second array");
			else
				System.out.println("All the elements are not found, hence first array is not a subset of second array");
			
			
		}
				
		
	}

}

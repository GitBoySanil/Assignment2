import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int num=scan.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+"th element");
			arr[i]=scan.nextInt();
		}
		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j]>arr[j-1])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Your sorted array is as below");
		
		for(int elem:arr)
		{
			System.out.println(elem);
		}
		
		

	}

}

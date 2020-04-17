import java.util.Scanner;
 class Array_frequency 
 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);	
		int n,i,count=0,max,min;
		#get size of the array
		System.out.println("enter the array size:");
		n=s.nextInt();
		int[] arr=new int[n];
		#getting elements
		System.out.println("enter the elements of array:");
		for( i = 0; i <n; i++)
				{
		arr[i]=s.nextInt();
		count=count+arr[i];
				}  
		System.out.println("total:"+count);
		max=arr[0];
		min=arr[0];
		for(int j=0;j<n;j++) {
								if(max<arr[j])
								{
									max=arr[j];
								}
								else if(min>arr[j])
								{
									min=arr[j];
								}
							}
		System.out.println("largest:"+max);

		System.out.println("smallest:"+min);
	
 	}
 }
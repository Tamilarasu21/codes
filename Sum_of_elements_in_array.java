import java.util.Scanner;
public class Array_sum
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        @SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = c.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = c.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
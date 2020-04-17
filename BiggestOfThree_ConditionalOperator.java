import java.util.Scanner;
class Biggest_of_three_using_conditional_operator 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,c,temp,result;
		System.out.println("enter a:");
		a=s.nextInt();
		System.out.println("enter b:");
		b=s.nextInt();
		System.out.println("enter c:");
		c=s.nextInt();
		temp=a > b ? a:b;   //check a or b
		result=temp > c ? temp:c;  //check the above result with c
		System.out.println("biggest number:"+result);
	}
}

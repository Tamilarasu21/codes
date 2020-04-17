import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("a:");
		a=s.nextInt();
		System.out.println("\n");
		System.out.println("b:");
		b=s.nextInt();
		a+=b;
		b=a-b;
		a-=b;

		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        int num;
       System.out.println("enter a number:");
       num=s.nextInt();
        boolean b = true;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                b = false;
                break;
            }
        }
        if (b)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
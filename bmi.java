import java.util.Scanner;
 class BMI 
 {
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
        float weight,height,bmi;
        System.out.println("enter your weight in kilograms:");
        weight=s.nextFloat();
        System.out.println("enter your height in meters:");
        height=s.nextFloat();
        bmi = weight / (height*height);
        System.out.println("\n");
        System.out.println("\t your bmi is:"+bmi);
        System.out.println("\n");
        System.out.println("\t _________________________");
        if(bmi<=18.5)
        {
            System.out.println("\t | you are under weight! |");
        }   else if(bmi>18.5 && bmi<25.0)
        {
            System.out.println("\t | you are normal weight |");
        }   else if(bmi>=25.0 && bmi<=29.9)
        {
            System.out.println("\t | you are over weight!! |");
        }   else if(bmi>=30.0)
        {
            System.out.println("\t | you are sooo obese!!! |");
        }
        System.out.println("\t _________________________");
    }
}

public class operators 
{
	public static void main(String []args)
	{
		//And operator
		int a=55;
		if(a>0 && (a%5==0))
		{
			System.out.println("value is divisible by 5");
		}
		else
		{
			System.out.println("Try again!");
		}
		
		//OR operator
		int age=15;
		if(age==18 || age>18)
		{
			System.out.println("Eligible to vote");
		}
		
		else
		{
			System.out.println("Not eligible..");
		}
		
	}
}

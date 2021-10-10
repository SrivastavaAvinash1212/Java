
public class Assignment2 
{
	public static void main(String [] args)
	{
		int num=10050,count=0;
		do
		{
			num=num/10;
			count=count+1;			
		}while(num!=0);
		System.out.println("Total number of digits "+count);
	}
	
}

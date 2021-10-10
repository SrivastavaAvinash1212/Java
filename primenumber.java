
public class primenumber {
	public static void main(String []args)
	{
		int n=17,i,count=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("Total number of factors = "+count);
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not prime");
		}
		
	}
}

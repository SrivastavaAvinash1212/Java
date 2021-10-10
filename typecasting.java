
public class typecasting 
{
	public static void main(String []args)
	{
		//widening typecasting(Automatic typecasting)
	
		byte a=10;
		short s=a;
		int i=100000;
		double dbl=i;
		
		System.out.println("Value of byte -: "+a);
		System.out.println("Value of Short -: "+s);
		System.out.println();
		System.out.println("Value of Integer -: "+i);
		System.out.println("Value of Double -: "+dbl);
	
		//narrowing typecasting(explicit typecasting)
		
		int l=2305401;
		short srt=(short)l;            //returns garbage value
		System.out.println(srt);
		
		double d=88.598;
		int n=(int)d;							
		System.out.println(n);
		
		long lng=95658905284l;
		short k=(short)lng;				//garbage value
		int z=(int)lng;
		System.out.println(k);
		System.out.println(z);
	}



}

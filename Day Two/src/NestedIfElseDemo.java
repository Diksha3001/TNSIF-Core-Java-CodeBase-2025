

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int no1=678,no2=96,no3=89;
		System.out.println("Gretest No from "+no1+", "+no2+" and "+no3);
		
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println(no1+" is Gretest Number");
			}
			else
			{
				System.out.println(no3+" is Gretest Number");
			}
		}
		else
		{
			if(no2>no3)
			{
				System.out.println(no2+" is Gretest Number");
			}
			else
			{
				System.out.println(no3+" is Gretest Number");
			}
		}
	}

}

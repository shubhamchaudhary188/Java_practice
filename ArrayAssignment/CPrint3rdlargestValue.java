class CPrint3rdlargestValue
{
	static void largestvalue(int x[])
	{
		if(x.length<3)
		{
			return;
		}
		int a=0,b=0,c=0;
		for(int i=0;i<x.length;i++)
		{
			if(a<x[i])
			{
				c=b;
				b=a;
				a=x[i];
			}
			else if(b<x[i])
			{
				c=b;
				b=x[i];
			}
			else if(c<x[i])
			{
				c=x[i];
				System.out.println(c+"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String... s)
	{
		largestvalue(new int[]{1,3,5,11,9,7});
	}
	
}
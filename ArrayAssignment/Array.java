class Array
{
	static int max(int x[])
	{
		int maxx=x[0];
		for (int i=1;i<x.length;i++)
		{
			if(maxx<x[i])
				maxx=x[i];
		}
		return(maxx);
	}
	public static void main(String... s)
	{
		System.out.println(max(new int[]{10,98,65,34,99}));
	}
}
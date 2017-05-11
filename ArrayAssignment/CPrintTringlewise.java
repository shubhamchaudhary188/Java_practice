class CPrintTringlewise
{
	static void tringlewise(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println(x[j]+"  ");
			}
			System.out.println("");
		}			
	}
	public static void main(String... s)
	{
		tringlewise(new int[]{1,2,3,4,5});
	}
}
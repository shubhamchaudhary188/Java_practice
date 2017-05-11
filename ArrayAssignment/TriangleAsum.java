class TriangleAsum
{
	static void sum(int x[][])
	{
		System.out.println("enter the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
			   System.out.println(x[i][j]);
			}
		}
		System.out.println("TriangleAsum of an matrix");
		int sum=0;
		for(int j=0;j<x.length;j++)
	    {
			for(int i=j;i>=0;i--)
			{
				sum=sum+x[i][j];
			}
		}
		System.out.println(sum+"\t");
	}
		public static void main(String... s)
		{
			sum(new int[][]{{1,2,3},{2,4,3},{4,3,5}});
		}
}
			
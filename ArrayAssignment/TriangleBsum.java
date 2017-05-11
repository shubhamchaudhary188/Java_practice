class TriangleBsum
{
	static void sum(int x[][])
	{
		System.out.println("the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
			   System.out.print(x[i][j]+"\t");
			}System.out.println("");
		}
		System.out.println("TriangleBsum of an matrix");
		int sum=0;
		for(int i=0;i<x.length;i++)
	    {
			for(int j=i;j>=0;j--)
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
	
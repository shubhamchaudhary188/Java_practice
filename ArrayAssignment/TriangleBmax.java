class TriangleBmax
{
	static void max(int x[][])
	{
		System.out.println(" the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
			   System.out.print(x[i][j]+"\t");
			}System.out.print("\n");
		}
		System.out.println("max no down tringle of an matrix");
		int max=0;
		for(int i=0;i<x.length;i++)
	    {
			for(int j=i;j>=0;j--)
			{
				if(max<x[i][j])
					max=x[i][j];
			}
		}
		System.out.println(max+"\t");
	}
		public static void main(String... s)
		{
			max(new int[][]{{1,2,3},{2,4,3},{99,100,5}});
		}
}
	
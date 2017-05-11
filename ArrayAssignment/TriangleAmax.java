class TriangleAmax
{
	static void max(int x[][])
	{
		System.out.println("enter the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
			   System.out.print(x[i][j]+"\t");
			}System.out.print("\n");
		}
		System.out.println("max no upper tringle of an matrix");
		int max=x[0][0];
		for(int i=0;i<x.length;i++)
	    {
			for(int j=i;j<x.length;j++)
			{
				if(max<x[i][j])
					max=x[i][j];
			}
		}
		System.out.println(max+"\t");
	}
		public static void main(String... s)
		{
			max(new int[][]{{99,2,3},{2,4,3},{4,3,5}});
		}
}
	
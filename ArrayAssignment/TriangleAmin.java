class TriangleAmin
{
	static void min(int x[][])
	{
		System.out.println(" the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
			   System.out.print(x[i][j]+"\t");
			}System.out.print("\n");
		}
		System.out.println("min no upper tringle of an matrix");
		int min=x[0][0];
		for(int i=0;i<x.length;i++)
	    {
			for(int j=i;j<x.length;j++)
			{
				if(min>x[i][j])
					min=x[i][j];
			}
		}
		System.out.println(min+"\t");
	}
		public static void main(String... s)
		{
			min(new int[][]{{99,2,3},{2,4,3},{4,3,5}});
		}
}
	
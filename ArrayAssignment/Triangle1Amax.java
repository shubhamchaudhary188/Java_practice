class Triangle1Amax
{
	static void max(int x[][])
	{
		int max=x[0][0];
		//System.out.println("the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=i;j<x.length;j++)
			{
			  // if(i<=j)
			  // {
				   if(x[i][j]>max)
				   {
				   max=x[i][j];
				   }
			  // }
			}
			System.out.println(max+"\t");
		}
	}
	public static void main(String... s)
		{
			max(new int[][]{{1,2,3},{2,4,3},{4,3,5}});
		}
}
	
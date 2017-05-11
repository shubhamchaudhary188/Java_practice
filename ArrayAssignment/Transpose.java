class Transpose
{
	static void trans(int x[][])
	{
		System.out.println("enter the matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.println(x[i][j]+"\t");
				
			}
			System.out.println( );
		}
		System.out.println("print the transpose matrix");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.println(x[j][i]+"\t");
			}
			System.out.println( );
		}
	}
	public static void main(String... s)
	{
		trans(new int[][]{{1,2,3},{3,4,5}});
	}
}
			
	
class AddToMatrix
{
	static void add(int m[][],int n[][])
	{
		
		int i=m[0].length,j=n[0].length;
		if(m.length==n.length&&m[i].length==n[i].length)
		{
			for(i=0;i<m.length;i++)
			{
				for(j=0;j<n[i].length;j++)
				{
					add[i][j]=first[i][j]+second[i][j];
				}
			}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println(int[i][j]);
			System.out.println();
		}
	}
	public static void main(String... s)
	{
	  add(new int[][]{{1,2,3},{4,5,6}},new int[][]{{1,2,3},{4,5,6}});
	}
}

class Array2Sort
{
	static void sort(int x[][])
	{
		int temp;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length-i-1;j++)
			{
				if(x[i][j]>x[i][j+1])
				{
					temp=x[i][j];
					x[i][j]=x[i][j+1];
					x[i][j+1]=temp;
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
		{
			System.out.println(x[i][j]+"\t");
		}		
	}
	}
	public static void main(String... s)
	{
		sort(new int[][]{{22,44,12,13,15},{23,43,55,66,77}});
	}
}
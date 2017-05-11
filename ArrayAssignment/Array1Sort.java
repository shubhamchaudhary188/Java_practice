class Array1Sort
{
	int temp;
	static void sort(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				for(int k=0;k<x[i].length-j-1;k++)
				{
					if(x[i][k]>x[i][k+1])
					{
						temp=x[i][k];
						x[i][k]=x[i][k+1];
						x[i][k+1]=temp;
					}
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String... s)
	{
		sort(new int[][]{{12,99,66,55},{33,100,87,21}});
	}
}
class ArraySort
{
	static void sort(int x[])
	{
		int temp;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length-i-1;j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]+"\t");
		}		
	}
	public static void main(String... s)
	{
		sort(new int[]{22,44,12,13,15});
	}
}
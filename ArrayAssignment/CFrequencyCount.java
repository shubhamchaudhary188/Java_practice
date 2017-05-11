class CFrequencyCount
{
	static void frequencyCount(int x[])
	{
		int[] z=new int[x.length];
		int flag=1,k=-1;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<z.length;j++)
			{
				if(x[i]!=z[j])
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				z[++k]=x[i];
		}
		int temp=0;
		System.out.println("Item\tElement");
		for(int i=0;i<=k;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(z[i]==x[j])
					++temp;
				
			}
			System.out.println(z[i]+"\t"+temp);
			temp=0;
		}
	}
	public static void main(String... s)
	{
		frequencyCount(new int[]{1,2,5,3,1,5,2,9,2});
	}
}
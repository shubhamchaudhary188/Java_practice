class Array_intersection
{
	static void intersecrion(int x[],int y[])
	{
		int flag=1,k=-1,i,j,count=0;
		int z[]=new int[x.length];
		for(i=0;i<y.length;i++)
		{
			for(j=0;j<x.length;j++)
			{
				if(y[i]==x[j])
				{
					flag=1;
					break;
				}
				else
					flag=0;
					
			}
			if(flag==1)
				z[++k]=y[i];
		}
		System.out.println("intersecrion of two array");
		for(i=0;i<z.length;i++)
		{
			if(z[i]==0)
				break;
			System.out.println(z[i]+"\t");
		}
	}
		public static void main(String... s)
		{
			intersecrion(new int[]{2,4,5},new int[]{2,5,6});
		}
}
	
		
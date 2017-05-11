class MergeSort
{
	 static void mergesort(int x[],int y[])
	{
		int temp,c=0,i,j;
		int z[]=new int[x.length+y.length];
		for(i=0;i<x.length;i++)
		{
			z[i]=x[i];
			c++;
		}
		for(i=0;i<y.length;i++)
				z[c++]=y[i];
		for(i=0;i<z.length;i++)
			for(j=0;j<z.length-i-1;j++)
			{
				if(z[j]>z[j+1])
				{
					temp=z[j];
					z[j]=z[j+1];
					z[j+1]=temp;
				}
			}
		System.out.println("sorted array is");
		for(i=0;i<z.length;i++)
		{
			System.out.println(z[i]+"\t");
		}		
	}
	public static void main(String... s)
	{
		mergesort(new int[]{2,1,3},new int[]{6,5,4});
	}
}
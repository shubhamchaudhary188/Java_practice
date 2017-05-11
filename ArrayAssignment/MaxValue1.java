public class MaxValue1
{
	public static void main(String... s)
	{
		int x[]=new int[]{10,20,30,40};
		int max=x[0];
		int min=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
             max=x[i];
		 else if(x[i]<min)
			 min=x[i];
		}

			System.out.println(max);
			System.out.println(min);
		
	}
}
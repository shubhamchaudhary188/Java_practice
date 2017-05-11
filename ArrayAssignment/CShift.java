class CShift
{
	static void shift(int x[])
	{
		for(int i=0;i<x.length-1;i++){
			for(int j=x.length-1;j>i;j--)
				if(x[j]<x[j-1])
				{
					int temp=x[j];
					x[j]=x[j-1];
					x[j-1]=temp;
				}
		}
				int tempindex=-1;
				for(int i=0;i<x.length;i++)
				{
					if(x[i]<0)
						tempindex++;
					else
						break;
				}
				for(int i=0;i<tempindex;i++)
				{
					for(int j=tempindex;j>i;j--)
						if(x[j]>x[j-1])
						{
							int temp=x[j];
							x[j]=x[j-1];
							x[j-1]=temp;
						}
						System.out.println(x[0]);
				}
						for(int i=1;i<x.length;i++)
						{
							System.out.println(x[i]);
						}
			
		
	}
	public static void main(String...s)
	{
		shift(new int[]{-1,1,-2,2,-3,3,-4,4,0});
	}
}

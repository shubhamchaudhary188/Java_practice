class Cdigonalwise
{
	static void digonalwise(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(x[i][j]+"\t");
			}	
			System.out.println("");
		}
		for(int i=0;i<x.length;i++)
		{
			int j=0,temp=i;
			while(temp>=0)
			{
				System.out.println(x[j][temp]+"\t");
				temp-=1;j++;
			}
			System.out.println(" ");
		}
		for(int i=0;i<x.length;i++)
		{
			int j=4,temp=i;
			while(temp>x.length)
			{
				System.out.println(x[temp][j]+"\t");
			}
			j--;
			temp+=1;
			System.out.println("");
		}
	}
	public static void main(String... s)
	{
		digonalwise(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
	}
	
}
class MulToMatrix
{
  static int mul(int m[][],int n[][])
  {
  int i=m.length;
  int j=m[0].length;
  int i=n.length;
  int j=n[0].length;
  if(i!=j)
   {
     int[][] result=new int[i][j];
     for(int i=0;i<i.length;i++)
      {
        for(int j=0;j<n[i]<j.length;j++)
         {
           result[i][j]=m[i][j]*n[i][j];
           return result;
         }
      }
   }
    for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println(int[i][j]+"\t");
			System.out.println();
		}
    	}
	public static void main(String... s)
	{
	  add(new int[][]{{1,2,3},{4,5,6}},new int[][]{{1,2,3},{4,5,6}});
	}
}

  
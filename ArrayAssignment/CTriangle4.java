class CTriangle4
{
	static void triangle4(String s)
	{
		for(int i=s.length()-1;i>=0;i--){
			for(int j=0;j<=i;j++)
				System.out.print(s.charAt(j));
				System.out.print();
		}
		    for(i=0;i<s.length();i++){
      for(int j=0;j<i;j++)
        System.out.print(" ");
      for (int j=i;j<s.length();j++ )
        System.out.print(s.charAt(j));
      System.out.println();
    }
	}
	public static void main(String[] args)
	{
		triangle4("shubham");
	}
}
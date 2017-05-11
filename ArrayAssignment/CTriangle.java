class CTriangle
{
	static void triangle(String s)
	{
		for(int i=0;i<s.length();i++){
			for(int j=0;j<=i;j++)
				System.out.println(s.charAt(j));
				System.out.println();
		}
	}
	public static void main(String[] args)
	{
		triangle("shubham");
	}
}
class Clength1
{
	static int length(String s)
	{
	int start=0;
	try
	{
	for(int i=0; ;i++){
		s.charAt(i);
			start++;
	}
	}
	catch(Exception e)
	{
	return start;
	}
	}
	public static void main(String... s)
	{
		System.out.println(length("shubham chaudhary"));
	}
}
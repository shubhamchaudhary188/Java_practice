class Cpolindrome
{
	static boolean polindrome(String s)
	{
		int start=0,end=s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;end--;
		}
		return true;
	}
	public static void main(String... s)
	{
		System.out.println(polindrome("Shubham"));
		System.out.println(polindrome("nitin"));
		System.out.println(polindrome("nisan"));
	}
	
}
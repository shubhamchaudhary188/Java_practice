class CReverse
{
	static String reverse(String s)
	{
	StringBuffer sb=new StringBuffer();
	for(int i=s.length()-1;i>=0;i--){
	   sb.append(s.charAt(i));
	}
	return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(reverse("1234"));
	}
}
	
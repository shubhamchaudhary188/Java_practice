class CRtrim
{
	static String rtrim(String s)
	{
	StringBuffer sb=new StringBuffer();
	int start=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' '){
			start++;
		}
		else 
		break;
	}
	for(int i=start;i<s.length();i++)
	{
		sb.append(s.charAt(i));
	}
	return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(rtrim("   shubham"));
	}
}
		
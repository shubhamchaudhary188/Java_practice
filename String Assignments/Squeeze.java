class Squeeze
{
	static String squeeze(String s)
	{
	StringBuffer sb=new StringBuffer();
	int start=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' '){
			sb.append(s.charAt(i));
		}
		else 
		continue;
	}
	return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(squeeze(" shubham chaudhary pawar "));
	}
}
		
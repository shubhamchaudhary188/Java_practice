class CLtrim
{
	static String ltrim(String s)
	{
	StringBuffer sb=new StringBuffer();
	int end=s.length();
	for(int i=s.length()-1;i>=0;i--){
		if(s.charAt(i)==' '){
			end--;
		}
		else 
		break;
	}
	for(int i=0;i<end;i++)
	{
		sb.append(s.charAt(i));
	}
	return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(ltrim("shubham  ")+"chaudhary");
	}
}
		
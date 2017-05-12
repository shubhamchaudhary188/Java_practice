class CAlltrim
{
	static String alltrim(String s)
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
	int end=s.length()-1;
	for(int i=s.length()-1;i>=0;i--){
		if(s.charAt(i)==' '){
			end--;
		}
		else 
		break;
	}
		for(int i=start;i<=end;i++)
	{
		sb.append(s.charAt(i));
	}
	return sb.toString();
	}
	public static void main(String... s)
	{
		System.out.println(alltrim("  shubham chaudhary  "));
	}
}
	

class CCountvowel
{
	static int countvowel(String s)
	{
	int temp=0;
	for(int i=0;i<s.length();i++){
		switch(s.charAt(i))
		{
		case 'a': temp++; break;
        case 'e': temp++; break;
        case 'i': temp++; break;
        case 'o': temp++; break;
        case 'u': temp++; break;
        case 'A': temp++; break;
        case 'E': temp++; break;
        case 'I': temp++; break;
        case 'O': temp++; break;
        case 'U': temp++; break;
		}
	}
	//System.out.println(count);
	return temp;
	}
	public static void main(String... s)
	{
		System.out.print(countvowel("shubham"));
	}
}
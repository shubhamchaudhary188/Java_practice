class CPrintNumToWord
{
	static void numtoword(long x)
	{
		String stringtoprint="";
		int tens=(int) (x%100); x/=100;
		int hundreds=(int) (x%10); x/=10;
		int thausand=(int) (x%100); x/=100;
		int lakh=(int) (x%100); x/=100;
		int carore=(int) (x);
		if(carore!=0)
		{
			stringtoprint+=inttostring(carore);
			stringtoprint+="carore";
		}
		if(lakh!=0)
		{
			stringtoprint+=inttostring(lakh);
			stringtoprint+="lakh";
		}
		if(thausand!=0)
		{
			stringtoprint+=inttostring(thausand);
			stringtoprint+="thausand";
		}
		if(hundreds!=0)
		{
			stringtoprint+=inttostring(hundreds);
			stringtoprint+="hundreds";
		}
		if(tens!=0)
		{
			stringtoprint+=inttostring(tens);
			stringtoprint+=".";
		}
		System.out.println(stringtoprint);
	}
	static String inttostring(int tempno)
	{
		int second=tempno%10,first=tempno/10; String mystring="";
		switch(first)
		{
			case 0: mystring+=""; break;
			case 2: mystring+="twenty"; break;
			case 3: mystring+="thirty"; break;
			case 4: mystring+="forty"; break;
			case 5: mystring+="fifty"; break;
			case 6: mystring+="sixty"; break;
			case 7: mystring+="seventy"; break;
			case 8: mystring+="eighty"; break;
			case 9: mystring+=" ninty"; break;
		default:
		switch(second)
		{
			case 0: mystring+="ten"; break;
			case 1: mystring+="eleven"; break;
			case 2: mystring+="twelve"; break;
			case 3: mystring+="thirteen"; break;
			case 4: mystring+="faurteen"; break;
			case 5: mystring+="fifteen"; break;
			case 6: mystring+="sixteen"; break;
			case 7: mystring+="seventeen"; break;
			case 8: mystring+="eighteen"; break;
			case 9: mystring+="nineteen"; break;
		}
		}
		if(first!=1)
		{
			switch(second)
			{
				case 0: mystring+=""; break;
				case 1: mystring+=" one "; break; 
				case 2: mystring+=" two "; break;
				case 3: mystring+=" three "; break;
				case 4: mystring+=" faur "; break;
				case 5:mystring+=" five "; break;
				case 6:mystring+=" six "; break;
				case 7: mystring+=" seven "; break;
				case 8: mystring+=" eight "; break;
				case 9: mystring+=" nine "; break;
				
			}
		}
		return mystring;
	}
	public static void main(String []args)
	{
		numtoword(839309597);
	}
}
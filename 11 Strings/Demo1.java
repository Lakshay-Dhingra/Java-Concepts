class Demo1
{
	public static void main(String[] args)
	{
		char arr[]={'a','b','c','d','e','f'};
		String str1 = new String(arr);
		System.out.println(str1.toString());
		System.out.println(str1.length());
		
		String str2 = new String(arr,2,4);
		System.out.println(str2.toString());
		System.out.println(str2.length());
		
		byte barr[]={65,66,67,68};
		String str3 = new String(barr);
		System.out.println(str3.toString());
		System.out.println(str3.length());

		String str4=new String(str3);
		System.out.println(str4);

		char carr[];
		carr=str1.toCharArray();
		for (char i: carr)
		{
			System.out.println(i);
		}

		byte darr[];
		darr=str1.getBytes();
		for (byte i: darr)
		{
			System.out.println(i);
		}

		String sobj=new String("The Quick e Brown Fox Quick Fox");
		int res;
		res=sobj.indexOf('c');
		System.out.println(res);
		res=sobj.indexOf("Quick");
		System.out.println(res);
		res=sobj.indexOf("Quick",15);
		System.out.println(res);

		//To print all occurences using indexOf
		int pos=-1;
		while(true)
		{
			pos=sobj.indexOf("Quick,pos+1");
			if(pos==-1)
				break;
			System.out.println("pos = "+pos);
		}

		//lastIndexOf


		//To print all occurences using lastIndexOf

		//substring()
		String sobj3=new String("Tajmahal");
		System.out.println(sobj3.substring(3));
		System.out.println(sobj3.substring(3,6));
		for(int i=1;i<=sobj3.length();i++)
		{
			System.out.println(sobj3.substring(0,i));
		}

		//trim()
		String s1=new String("  Hind ustan  ");
		String s2=new String("  Tim es  ");
		System.out.println(s1+"+"+s2);
		System.out.println(s1.trim()+"+"+s2);
		System.out.println(s1.trim()+"+"+s2.trim());
		System.out.println(s1+"+"+s2);

		//startsWith() and endsWith()

		String names[]={"Mr. Vishal","Dr. Diwan","Mrs. Sharma"," Dr. Arun Sharma"};
		for(String val:names)
		{
			if(val.trim().startsWith("Dr."))
			System.out.println(val);
		}

		for(String val:names)
		{
			if(val.trim().endsWith("Sharma"))
			System.out.println(val);
		}

		//equals()

		//equalsIgnoreCase

		//regionMatches
		String mystr1=new String("The Quick Fox Jumps");
		String mystr2=new String("I am Quick xyz");

		boolean res2=mystr1.regionMatches(4,mystr2,5,5);
		System.out.println(res2);

		//compareTo()
		String mys1=new String("ABC");
		String mys2=new String("ADC");

		System.out.println(mys1.compareTo(mys2));




		//valueOf()

		double salary=23454.3535;
		String res3=String.valueOf(salary);
		for(char ch:res3.toCharArray())
		{
			System.out.print(ch+" ");
		}

		Rect robj=new Rect();
		String res4=String.valueOf(robj);
		System.out.print(res4);


		//charAt()

		String s11=new String("ABCDEF");
		for(int i=0;i<s11.length();i++)
		{
			System.out.print(s11.charAt(i));
		}

		//WAP To count number of digits of a number
		System.out.println("\nEnter a number: ");
		java.util.Scanner cin=new java.util.Scanner(System.in);
		int num=cin.nextInt();
		System.out.println("Total Digits = "+String.valueOf(num).length());

		//split()
		String str="This is a Demo to check split()";
		String arr1[]=str.split(" ");
		for(String m:arr1)
		{
			System.out.println(m);
		}
		System.out.println("No of words:"+arr.length);

		//but if there are more than one space between words
		String lstr="This  is   a  Demo to check   split()";
		String arr2[]=lstr.split(" ");
		int num_of_words=0;
		for(String m:arr2)
		{
			if(m.length()>0)
				num_of_words++;
		}
		System.out.println("No of words:"+num_of_words);

		//replace()

		
	}
}

class Rect
{

}
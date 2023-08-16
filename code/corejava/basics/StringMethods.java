public class StringMethods
{
	public static void main(String args[])
	{
		String s1 = "Welcome";
		System.out.println(s1);
		String s2 = " String";
		//String str1 = s1.concat(s2);
		String str1 = s1 + s2;
		System.out.println(str1); // Welcome String
		System.out.println(" Add : "+ (12 - 23)); // Add : -11

		String s3 = "First Middle Last";
		System.out.println(s3.substring(13));
		System.out.println(s3.substring(0, 5));
		String dob = "12/11/2000";
		String arr[] = dob.split("/");
		System.out.println("Day : " + arr[0]);
		System.out.println("Month : " + arr[1]);
		System.out.println("Year : " + arr[2]);

		String tokan = "1-20-08";
		String tks[] = tokan.split("-");
		System.out.println("Number : " + tks[0]);
		System.out.println("Day : " + tks[1]);
		System.out.println("Month : " + tks[2]);

		String s4 = "Hello";
		String s5 = "HELLO";
		System.out.println(s4 == s5); // false
		System.out.println(s4.equalsIgnoreCase(s5)); // true	
		String s6 = "Hello This is the Java String Program.";
		int count = s6.length(); 
		System.out.println(count);
		String name = "     ";
		//System.out.println(name);
		//System.out.println(name.trim()); 
		System.out.println(name.trim().isEmpty()); // true
		//System.out.println(name.isBlank()); // Java 11

		String s7 = "Hello Java";
		System.out.println(s7.indexOf("a"));
		System.out.println(s7.charAt(6));

		String resume = "resume_abc.pdf.pdf";
		System.out.println(resume.endsWith(".pdf"));
		System.out.println(resume.startsWith("resume_"));

		String s8 = "Abc Xyz lmn";
		System.out.println(s8.contains("lmn"));	

		String s9 = "Welcome";
		char ch[] = s9.toCharArray();
		for(int i = ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);	
		}
		// emocleW

	}
}















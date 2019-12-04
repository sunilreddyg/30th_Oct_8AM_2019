package corejava.Variable;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		String accept set off charcters to store,
		 * 		And String also called as Class,Because
		 * 		String contains set of methods to validate
		 * 		behaviour of stored characters.
		 * 
		 * 		=> Stored charcters to validate String class,
		 * 			It contain set of String comparision methods.
		 */
			
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings,
		 * 		And return boolean valure true/false.
		 * 		The Comparision is case-sensitive.
		 */
		String Act_result="Account Created";
		String Exp_result="account created";
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equal comparision by ignoring case-
		 * 		sensitive and return boolean value true/false.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("EqualIgnorecase comparision is => "+flag1);

		
		/*
		 * Contains:-->
		 * 		Method verify partial characters exist at mainString.
		 * 		And return boolean value true/false.
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Sub String available status is => "+flag2);
		
		
		/*
		 * subString;-->
		 * 			Method get sub string from mainString,Using
		 * 			begin and End index numbers.
		 */
		String Account_num="1111021544447878";
		String Middle_Digits=Account_num.substring(4, 8);
		System.out.println("Middle_digits are => "+Middle_Digits);
		String Last_digits=Account_num.substring(12);
		System.out.println("last digits are => "+Last_digits);
		
		
		/*
		 * length:-->
		 * 			Method return count of characters available at
		 * 			string.
		 */
		String Mobile_num="9030248855";
		int length=Mobile_num.length();
		System.out.println("Mobile number length is => "+length);
		
		
		/*
		 * trim:--> Method trim extra spaces at string,
		 */
		String toolname="   WeDriver    ";
		System.out.println("Before trim length of string is => "+toolname.length());
		//trimming Extra spaces
		String Tool=toolname.trim();
		System.out.println("After trim length of string is => "+Tool.length());
		
		
		/*
		 * isEmpty:-->
		 * 		    Method verify empty status at string and return value
		 * 			boolean true/false.
		 */
		 String ref="MQ";
		 String ref1="";
		 System.out.println("ref empty status is => "+ref.isEmpty());
		 System.out.println("ref empty status is => "+ref1.isEmpty());
		 
		 
		 /*
		  * toLowserCase:-->
		  * 			Method convert all uppercase characters to lowercase
		  */
		 String ref_code="ABCDEF";
		 System.out.println("Ref code in lowercase => "+ref_code.toLowerCase());
		
		
		 /*
		  * touppercase:-->
		  * 		Method convert all lowercase characters to uppercase
		  */
		 String ref_code1="ghijklm";
		 System.out.println("Ref code1 in uppercase => "+ref_code1.toUpperCase());
		
		
		 /*
		  * split:-->
		  * 	Method split String using delimeter, And store all
		  * 	store into array.
		  */
		 String email="sunil@reddy@mindq@dsnr";
		 String arr[]=email.split("@");
		 System.out.println(arr[0]+"     "+arr[1]+"    "+arr[2]+"     "+arr[3]);
	
		 
		 /*
		  * charAt:-->
		  * 		method get any single character from string using index number.
		  */
		 String IFSC="HDFC";
		 char Char=IFSC.charAt(1);
		 System.out.println("Character at first position is => "+Char);
		 
		 
		 //How to Reverse a String.
		 String Inst_name="MINDQ";
		 char rev[]=Inst_name.toCharArray();
		 for (int i = Inst_name.length()-1; i >= 0; i--) 
		 {
			System.out.print(rev[i]);
		 }
		 
		 
		 
		 
	}

}

package assignment_19;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
		insideBrackets("x[hello]") <b>---></b> [hello] <br>
		insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */
	
	public static String insideBrackets(String str) {
		
		//using loop
//		int start = 0;
//		int end = 0;
//		
//		for (int i=0; i<str.length(); i++) {
//			if (str.charAt(i) == '[') {
//				start = i;
//				break;
//			}
//
//		}
//		
//		for (int i=str.length()-1; i>=0; i--) {
//			if (str.charAt(i) == ']') {
//				end = i;
//				break;
//			}
//
//		}
//		
//		return str.substring(start, end+1);
		

		// using recursion
		if(str.charAt(0) != '[')
			return insideBrackets(str.substring(1));

		if(str.charAt(str.length()-1) != ']')
			return insideBrackets(str.substring(0, str.length()-1));
		
		return str;
		
		
		
		
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}


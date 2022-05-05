package hw1;


class hw1{
		
	/** Returns the num'th fibonnaci number. The fibonacci numbers are defined as:
	 * 		The first two fibonnaci numbers are 1
	 * 		Each fibonnaci number after that is the sum of the previous two fibonacci numbers
	 * 
	 * @param num The num'th fibonacci number to calculate
	 * @return The num'th fibonacci number
	 */
	public static int fibonacci(int num) {
		
		if (num == 1 || num == 2){;
			return 1;
		}
// >>> [NL] These if statements can be combined to be one else if using `||`. (-1)
		int before = 1;
		int after = 1;
		int fib = before + after;
		for(int i = 2; i < num; i++) {
			int next_num = before;
			before = after;
			after = next_num;
			
		}
		
		return fib;
				
	}
	
	
	
	
	/**
	 * Takes an input and returns a string with each item in the String in alpha-numeric order. You can use the character value to determine the order. 
	 * For example:
	 * stringToSort.charAt(1) < stringToSort.charAt(2)
	 * will compare the characters of stringToSort at indexes 1 and 2. 
	 * Use this model of comparison to determine order in the final string. 
	 *
	 * You may not use the .sort() function! This will result in 0 credit for this problem.
	 * 
	 * @param stringToSort The string that will be sorted
	 * @return Sorted version of stringToSort
	 */
	public static String sorter(String stringToSort) {
// >>> [NL] Don't leave commented-out code in your final submission! (-1)
		
		}
	

	
	/** 
	 * Return a string where every word is pig latin. You may assume there is no punctuation. 
	 *
	 * For the purpose of this assignment, assume that y is always a vowel.
	 * 
	 * Don't forget to capitalize the first letter of your new sentence, and fix capitalization for the rest of the sentence (no need to worry about proper nouns).
	 *  
	 * 
	 * 
	 * Pig latin definition courtesy of https://web.ics.purdue.edu/~morelanj/RAO/prepare2.html
	 * 
	 * 
	 * 1. If a word starts with a consonant and a vowel, put the first letter of the word at the end of the word and add "ay."
	 * Example: Happy = appyh + ay = appyhay
	 * 2. If a word starts with two consonants move the two consonants to the end of the word and add "ay."
	 * Example: Child = Ildch + ay = Ildchay
	 * 3. If a word starts with a vowel add the word "ay" at the end of the word.
	 * Example: Awesome = Awesome +way = Awesomeay
	 * 
	 * Hints: Check out the String Java collections framework (particularly the methods section)! You may use any String functions on the docs.
	 * Found here: 
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	 * 
	 * 
	 * @param sentence The sentence to convert to pig latin
	 * @return Return our input string but in pig latin
	 */
	public static String pigLatin(String sentence) {
// >>> [NL] You can't check if something equals multiple things the way you can in Python.
// You need to set it equal in each || statement. (No point deduction)
		int size = sentence.length();
		String pigL = ""; 
		int i;
		for(i = 0; i < size; i++) {
			if(isVowel(sentence.charAt(i))) {
		             break;
		     }
		 }
		 if( i == size) {
		      return "";
		 }
		   
		 pigL = sentence.substring(i);
		 pigL = pigL + sentence.substring(0, i - 0);
		 pigL = pigL + "ay";
		 return pigL;
		
	}
	
	 public static Boolean isVowel(char c) {
	     if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
	        c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
	       
	        return true;
	       
	     }return false;
	 }
==================================================
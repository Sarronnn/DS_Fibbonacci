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
		
		if (num == 1){;
			return 1;
		}
		if (num == 2){
			return 1;
		}
		else{
			return fibonacci(num - 1) + fibonacci(num - 2);
			
		}
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
		//if (stringToSort = "" != null) {
		new String sorts = stringToSort.charAt(0);
		for (int i = 0; i< stringToSort.length(); i++)  {
			if (stringToSort.charAt(i) < stringToSort.charAt(i + 1) {
				sorts.charAt(i) = stringToSort.charAt(i);
			else
				sorts.charAt(i + 1) = stringToSort.charAt(i + 1);
			
		
		
		return sorts;	
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
		//String vowels = "aeiou";
		for (int i = 0; i < sentence.length(); i++) {
		if (sentence.charAt(i) && sentence.charAt(i + 1) == "a" || "e" || "i" || "o" || "u") {
			new String sent = sentence
			sent
			}
				
			
		}
		return sentence;
	}
	
	
	
	
	
	/** 
	 *  Given an array of ints, a triple exists if any value appears 3 times in a row within the array.
	 *  
	 *  
	 *  @param arr Array to check if there is a triple
	 *  @return True if the array has a triple, otherwise false
	 */
	public static boolean hasTriple(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
				i++;
				return true;
			else {
				return false;
	}
			}
	}
	}
	
	/** 
	 * Given a num greater than 1, return true if that number is prime, otherwise return false
	 * 
	 * A prime number is defined as an integer that is only divisible by one and itself.
	 * A number is not prime if any number between [2, n-1] divide it.
	 * 
	 * @param num The number that needs to be determined if its prime or not
	 * @return True if num is a prime, otherwise false
	 */
	public static boolean isPrime(int num) {
		// TODO
		return false;
	}
	
	
}
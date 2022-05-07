package hw1;

import java.util.stream.Stream;

class hw1{

	/** Returns the num'th fibonnaci number. The fibonacci numbers are defined as:
	 * 		The first two fibonnaci numbers are 1
	 * 		Each fibonnaci number after that is the sum of the previous two fibonacci numbers
	 *
	 * @param num The num'th fibonacci number to calculate
	 * @return The num'th fibonacci number
	 */
	public static int fibonacci(int num) {
<<<<<<< HEAD
		
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
	
	
	
	
=======
		if(num == 1 || num == 2) {
			return 1;
		}
		int after = 1;
		int before = 1;
		for(int i = 2; i < num; i++) {
			int new_after = after;
			after+= before;
			before = new_after;
		}
		return after;
		}


>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17
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
<<<<<<< HEAD
// >>> [NL] Don't leave commented-out code in your final submission! (-1)
		char[] sorted = stringToSort.toCharArray();
			for(int i = 0; i < (sorted.length - 1); i++) {
				for(int j = i + 1; j > 0; j--) {
					if(sorted[j] < sorted[j-1]) {
						char t = sorted[j - 1];
						sorted[j-1] = sorted[j];
						sorted[j] = t;
					}
				}
			}
		stringToSort = String.valueOf(sorted);
		return stringToSort;
		}
	
=======
		char[] correct = stringToSort.toCharArray();
			for(int i = 0; i < (correct.length - 1); i++) {
				for(int j = i + 1; j > 0; j--) {
					if(correct[j] < correct[j-1]) {
						char neww = correct[j - 1];
						correct[j-1] = correct[j];
						correct[j] = neww;
					}
				}
			}
			stringToSort = String.valueOf(correct);
			return stringToSort;
		}



>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17

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
<<<<<<< HEAD
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

=======
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
>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17
				
			}
			
<<<<<<< HEAD

	
	
	
// >>> [NL] Be consistent about the number of new lines between methods. (-1)
	
	
	/** 
=======
			 public static Boolean isVowel(char c) {
			     if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
			        c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
			       
			        return true;
			       
			     }return false;
			 }
		

		





	/**
>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17
	 *  Given an array of ints, a triple exists if any value appears 3 times in a row within the array.
	 *  
	 *  
	 *  @param arr Array to check if there is a triple
	 *  @return True if the array has a triple, otherwise false
	 */

	public static boolean hasTriple(int[] arr) {
<<<<<<< HEAD
		int i = 0;
		while( i < arr.length) {
			i ++;
			return (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]); 	
		}return false;
	} 
		
	

// >>> [NL] Make sure your brackets line up. (-1)
	
	/** 
=======
		for(int i = 0; i < arr.length; i++) {
			if(!valid(arr, i))
				return true;
		}
		return false;
	}
	static boolean valid(int[] arr, int index) {
	if(index < 1 || index >= arr.length - 1)
		return true;
		return !(arr[index - 1] == arr[index] && arr[index] == arr[index + 1]);
	}

	/**
>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17
	 * Given a num greater than 1, return true if that number is prime, otherwise return false
	 *
	 * A prime number is defined as an integer that is only divisible by one and itself.
	 * A number is not prime if any number between [2, n-1] divide it.
	 *
	 * @param num The number that needs to be determined if its prime or not
	 * @return True if num is a prime, otherwise false
	 */
	public static boolean isPrime(int num) {
<<<<<<< HEAD
	int i = 2;
	if (num % 2 == 0 && num % i+1 == 0) {
		return false;
	}
// >>> [NL] Don't leave TODO comments in your final submission! (-1)
		return true;
	}
	
	
=======
		boolean bool = false;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
		        bool = true;   
		      }
			else {
				bool = false;
			}
			
		 } return bool;
	}


>>>>>>> a9fda9d0848785d44bab202d76301aa0cc80ab17
}

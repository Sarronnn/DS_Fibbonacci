package hw1;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class hw1_test {	
	
	@Test
	public void test_fibonacci1() {
		assertTrue(hw1.fibonacci(1) ==  1);
		assertFalse(hw1.fibonacci(1) ==  3);
		assertTrue(hw1.fibonacci(3) == 2);
	}

	@Test
	public void test_fibonacci2() {
		assertTrue(hw1.fibonacci(60) ==  1820529360);
		assertTrue(hw1.fibonacci(10) == 55);
	}
	
	@Test
	public void test_sorter1() {
		String sent1 = "acb";
		assertTrue(hw1.sorter(sent1).equals("abc"));
	}
	
	@Test
	public void test_sorter2() {
		String sent2 = "h311o";
		assertTrue(hw1.sorter(sent2).equals("113ho"));	
	}
	
	
	
	@Test
	public void test_triples1() {
		int[] arr1 = new int[] {1, 2, 3, 1, 2, 3};
		assertFalse(hw1.hasTriple(arr1));
		
		int[] arr2 = new int[] {1, 1, 1, 1, 2, 3};
		assertTrue(hw1.hasTriple(arr2));
	}
	@Test
	public void test_triples2() {
		int[] arr1 = new int[] {1, 2, 1, 2, 1, 2, 1, 2};
		assertFalse(hw1.hasTriple(arr1));
		
		int[] arr2 = new int[] {1, 2, 1, 2, 1, 2, 2, 2};
		assertTrue(hw1.hasTriple(arr2));
		
	}
	
	
	@Test
	public void test_piglatin1() {
		String s = "Sentence";
		assertTrue(hw1.pigLatin(s).equals("Entencesay"));
	}
	
	@Test
	public void test_piglatin2() {
		String s = "This is a sentence";
		assertTrue(hw1.pigLatin(s).equals("Isthay isay aay entencesay"));
	}
	
	
	
	
	@Test
	public void test_isPrime1() {
		assertTrue(hw1.isPrime(13));
		assertTrue(hw1.isPrime(17));
	}
	
	@Test
	public void test_isPrime2() {
		assertFalse(hw1.isPrime(4));
		assertFalse(hw1.isPrime(6));
	}
	
	
}

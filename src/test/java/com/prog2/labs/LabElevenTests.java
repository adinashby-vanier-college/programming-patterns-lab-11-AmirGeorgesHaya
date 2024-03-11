package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabElevenTests {

	@Test
	void groupAnagramsTest1() {

		String[] inputWordList = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> actualList = LabEleven.groupAnagrams(inputWordList);
		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];
		
		for(int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
			Arrays.sort(actual[i]);
		}
		
		String[][] expected = { {"bat"}, { "nat", "tan" }, { "ate", "eat", "tea" }};
		
		Arrays.sort(actual, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				
				return o1[0].compareTo(o2[0]);
			}
		});
		
		Arrays.sort(expected, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				
				return o1[0].compareTo(o2[0]);
			}
		});
		
		assertTrue(Arrays.deepEquals(actual, expected));
	}
	
	@Test
	void groupAnagramsTest2() {

		String[] inputWordList = { "" };

		List<List<String>> actualList = LabEleven.groupAnagrams(inputWordList);
		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];
		
		for(int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
			Arrays.sort(actual[i]);
		}
		
		String[][] expected = { {""} };
		
		assertTrue(Arrays.deepEquals(actual, expected));
	}
	
	@Test
	void groupAnagramsTest3() {

		String[] inputWordList = { "a" };

		List<List<String>> actualList = LabEleven.groupAnagrams(inputWordList);
		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];
		
		for(int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
			Arrays.sort(actual[i]);
		}
		
		String[][] expected = { {"a"} };
		
		assertTrue(Arrays.deepEquals(actual, expected));
	}
	
	@Test
	void groupAnagramsTest4() {

		String[] inputWordList = { "dusty", "below", "elbow", "cat", "study", "act" };

		List<List<String>> actualList = LabEleven.groupAnagrams(inputWordList);
		String[][] actual = new String[actualList.size()][];
		String[] blankArray = new String[0];
		
		for(int i = 0; i < actualList.size(); i++) {
			actual[i] = actualList.get(i).toArray(blankArray);
			Arrays.sort(actual[i]);
		}
		
		String[][] expected = { {"act", "cat"}, {"dusty", "study"}, {"below", "elbow"} };
		
		Arrays.sort(actual, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				
				return o1[0].compareTo(o2[0]);
			}
		});
		
		Arrays.sort(expected, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				
				return o1[0].compareTo(o2[0]);
			}
		});
		
		assertTrue(Arrays.deepEquals(actual, expected));
	}
}

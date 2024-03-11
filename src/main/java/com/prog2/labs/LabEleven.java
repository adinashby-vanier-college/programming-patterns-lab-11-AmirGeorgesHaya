package com.prog2.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author adinashby
 *
 */

public class LabEleven {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
     * @param strs
     * @return 
	 */
//String[] inputWordList = { "eat", "tea", "tan", "ate", "nat", "bat" };
//String[][] expected = { {"bat"}, { "nat", "tan" }, { "ate", "eat", "tea" }};

    public static List<List<String>> groupAnagrams(String[] strs) {
        
        char[] chara= new char[strs.length];
       Map<String, List<String>> map = new HashMap<>();
       int numRows=0;
      String[] words = new String[strs.length];
      
        for(String str: strs)
        {
            
            // converts a string word into a char array
            // eat--> [e, a, t]
           char[] charArray = str.toCharArray();
            
           //sorting the char array in alphabetical order
           Arrays.sort(charArray);

           // converts the char array into a word
            String sortedString = new String(charArray);
            
            
            // takes the sorted word and puts it as a key
            // the values will be an arrayList that has all the
            // characters of the key
            
            // this created a key for a new sorted word
            map.putIfAbsent(sortedString, new ArrayList<>());
            
            // if a sorted word key already exists
            // it will take the string and add it to that arrayList
            map.get(sortedString).add(str);
            
        }
       
        // create the List of lists.
        /*
        if you say map.values, it will print all the values of the Map
        if you tell the arrayList
        */
        // printing this creates an array of arrays.
        //usually it would only do [**,***,] because it prints
        // each values from a key. But since we have a collection
        // of values (an arrayList), it prints an array of values from the map value array
         System.out.println(map.values());
         
         // new ArrayList... basically creates a List of a List
        List<List<String>> finalArray = new ArrayList<>(map.values());
        
return finalArray;
}
}
